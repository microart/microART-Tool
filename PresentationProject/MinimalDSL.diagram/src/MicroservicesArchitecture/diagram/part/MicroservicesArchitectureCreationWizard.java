/*
 * 
 */
package MicroservicesArchitecture.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class MicroservicesArchitectureCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected MicroservicesArchitecture.diagram.part.MicroservicesArchitectureCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected MicroservicesArchitecture.diagram.part.MicroservicesArchitectureCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(MicroservicesArchitecture.diagram.part.Messages.MicroservicesArchitectureCreationWizardTitle);
		setDefaultPageImageDescriptor(
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin
						.getBundledImageDescriptor("icons/wizban/NewMicroservicesArchitectureWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureCreationWizardPage(
				"DiagramModelFile", getSelection(), "microservicesarchitecture_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage.setTitle(
				MicroservicesArchitecture.diagram.part.Messages.MicroservicesArchitectureCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				MicroservicesArchitecture.diagram.part.Messages.MicroservicesArchitectureCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureCreationWizardPage(
				"DomainModelFile", getSelection(), "microservicesarchitecture") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".microservicesarchitecture_diagram".length()); //$NON-NLS-1$
					setFileName(MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "microservicesarchitecture")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(
				MicroservicesArchitecture.diagram.part.Messages.MicroservicesArchitectureCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				MicroservicesArchitecture.diagram.part.Messages.MicroservicesArchitectureCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								MicroservicesArchitecture.diagram.part.Messages.MicroservicesArchitectureCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						MicroservicesArchitecture.diagram.part.Messages.MicroservicesArchitectureCreationWizardCreationError,
						null, ((CoreException) e.getTargetException()).getStatus());
			} else {
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}

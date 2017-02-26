/*
 * 
 */
package MicroservicesArchitecture.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class MicroservicesArchitectureEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getVisualID(view)) {

			case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.ProductEditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.MicroServiceNameEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.MicroServiceNameEditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.DeveloperNameEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.DeveloperNameEditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPointEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPointEditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPoint2EditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPoint2EditPart(view);

			case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart(
						view);

			case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart(
						view);

			case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID:
				return new MicroservicesArchitecture.diagram.edit.parts.LinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}

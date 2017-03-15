/*
* 
*/
package MicroservicesArchitecture.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MicroservicesArchitectureNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem item = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

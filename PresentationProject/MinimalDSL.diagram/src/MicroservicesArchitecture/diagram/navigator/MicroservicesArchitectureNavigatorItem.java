/*
* 
*/
package MicroservicesArchitecture.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MicroservicesArchitectureNavigatorItem
		extends MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public MicroservicesArchitectureNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) {
			return EcoreUtil.getURI(getView())
					.equals(EcoreUtil
							.getURI(((MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}

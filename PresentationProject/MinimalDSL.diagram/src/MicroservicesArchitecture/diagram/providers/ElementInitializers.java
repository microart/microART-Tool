/*
 * 
 */
package MicroservicesArchitecture.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}

/*
 * 
 */
package MicroservicesArchitecture.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		MicroservicesArchitecture.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		MicroservicesArchitecture.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		MicroservicesArchitecture.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		MicroservicesArchitecture.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		MicroservicesArchitecture.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}

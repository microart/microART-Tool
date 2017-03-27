/*
 * 
 */
package MicroservicesArchitecture.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MicroservicesArchitectureParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser microServiceName_5003Parser;

	/**
	* @generated
	*/
	private IParser getMicroServiceName_5003Parser() {
		if (microServiceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getElement_Name() };
			MicroservicesArchitecture.diagram.parsers.MessageFormatParser parser = new MicroservicesArchitecture.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("    {0}"); //$NON-NLS-1$
			parser.setEditorPattern("    {0}"); //$NON-NLS-1$
			parser.setEditPattern("    {0}"); //$NON-NLS-1$
			microServiceName_5003Parser = parser;
		}
		return microServiceName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser teamName_5004Parser;

	/**
	* @generated
	*/
	private IParser getTeamName_5004Parser() {
		if (teamName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getElement_Name() };
			MicroservicesArchitecture.diagram.parsers.MessageFormatParser parser = new MicroservicesArchitecture.diagram.parsers.MessageFormatParser(
					features);
			teamName_5004Parser = parser;
		}
		return teamName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser developerEmail_5005Parser;

	/**
	* @generated
	*/
	private IParser getDeveloperEmail_5005Parser() {
		if (developerEmail_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getDeveloper_Email() };
			MicroservicesArchitecture.diagram.parsers.MessageFormatParser parser = new MicroservicesArchitecture.diagram.parsers.MessageFormatParser(
					features);
			developerEmail_5005Parser = parser;
		}
		return developerEmail_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser interfaceEndPoint_5001Parser;

	/**
	* @generated
	*/
	private IParser getInterfaceEndPoint_5001Parser() {
		if (interfaceEndPoint_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getInterface_EndPoint() };
			MicroservicesArchitecture.diagram.parsers.MessageFormatParser parser = new MicroservicesArchitecture.diagram.parsers.MessageFormatParser(
					features);
			interfaceEndPoint_5001Parser = parser;
		}
		return interfaceEndPoint_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser interfaceEndPoint_5002Parser;

	/**
	* @generated
	*/
	private IParser getInterfaceEndPoint_5002Parser() {
		if (interfaceEndPoint_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getInterface_EndPoint() };
			MicroservicesArchitecture.diagram.parsers.MessageFormatParser parser = new MicroservicesArchitecture.diagram.parsers.MessageFormatParser(
					features);
			interfaceEndPoint_5002Parser = parser;
		}
		return interfaceEndPoint_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceNameEditPart.VISUAL_ID:
			return getMicroServiceName_5003Parser();
		case MicroservicesArchitecture.diagram.edit.parts.TeamNameEditPart.VISUAL_ID:
			return getTeamName_5004Parser();
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEmailEditPart.VISUAL_ID:
			return getDeveloperEmail_5005Parser();
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPointEditPart.VISUAL_ID:
			return getInterfaceEndPoint_5001Parser();
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPoint2EditPart.VISUAL_ID:
			return getInterfaceEndPoint_5002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

/**
 */
package MicroservicesArchitecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MicroservicesArchitecture.MicroservicesArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface MicroservicesArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MicroservicesArchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.thesis.msa.arch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroservicesArchitecturePackage eINSTANCE = MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.ElementImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.ProductImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Composed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COMPOSED_BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Divided In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DIVIDED_IN = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TEAMS = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LINKS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Developers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DEVELOPERS = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__URL = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.MicroServiceImpl <em>Micro Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.MicroServiceImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getMicroService()
	 * @generated
	 */
	int MICRO_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Compose</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__COMPOSE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Belong To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__BELONG_TO = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expose</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__EXPOSE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__HOST = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__OWNED = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Require</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__REQUIRE = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__TYPE = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Micro Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.ClusterImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__CONTAINS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Divide</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__DIVIDE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__CONTEXT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.DeveloperImpl <em>Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.DeveloperImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getDeveloper()
	 * @generated
	 */
	int DEVELOPER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__EMAIL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__USERNAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Works For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__WORKS_FOR = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.InterfaceImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Exposed By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXPOSED_BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__END_POINT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PORT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__REQUIRED_BY = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.LinkImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DEPENDENCY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.impl.TeamImpl
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Composed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__COMPOSED_BY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__WORK_ON = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work For</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__WORK_FOR = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link MicroservicesArchitecture.serviceType <em>service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MicroservicesArchitecture.serviceType
	 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getserviceType()
	 * @generated
	 */
	int SERVICE_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see MicroservicesArchitecture.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MicroservicesArchitecture.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see MicroservicesArchitecture.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link MicroservicesArchitecture.Product#getComposedBy <em>Composed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed By</em>'.
	 * @see MicroservicesArchitecture.Product#getComposedBy()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ComposedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link MicroservicesArchitecture.Product#getDividedIn <em>Divided In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divided In</em>'.
	 * @see MicroservicesArchitecture.Product#getDividedIn()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_DividedIn();

	/**
	 * Returns the meta object for the containment reference list '{@link MicroservicesArchitecture.Product#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see MicroservicesArchitecture.Product#getTeams()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link MicroservicesArchitecture.Product#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see MicroservicesArchitecture.Product#getLinks()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link MicroservicesArchitecture.Product#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Developers</em>'.
	 * @see MicroservicesArchitecture.Product#getDevelopers()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Developers();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MicroservicesArchitecture.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Product#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see MicroservicesArchitecture.Product#getUrl()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Url();

	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.MicroService <em>Micro Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Micro Service</em>'.
	 * @see MicroservicesArchitecture.MicroService
	 * @generated
	 */
	EClass getMicroService();

	/**
	 * Returns the meta object for the container reference '{@link MicroservicesArchitecture.MicroService#getCompose <em>Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Compose</em>'.
	 * @see MicroservicesArchitecture.MicroService#getCompose()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Compose();

	/**
	 * Returns the meta object for the reference '{@link MicroservicesArchitecture.MicroService#getBelongTo <em>Belong To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belong To</em>'.
	 * @see MicroservicesArchitecture.MicroService#getBelongTo()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_BelongTo();

	/**
	 * Returns the meta object for the containment reference list '{@link MicroservicesArchitecture.MicroService#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expose</em>'.
	 * @see MicroservicesArchitecture.MicroService#getExpose()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Expose();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.MicroService#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see MicroservicesArchitecture.MicroService#getHost()
	 * @see #getMicroService()
	 * @generated
	 */
	EAttribute getMicroService_Host();

	/**
	 * Returns the meta object for the reference '{@link MicroservicesArchitecture.MicroService#getOwned <em>Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned</em>'.
	 * @see MicroservicesArchitecture.MicroService#getOwned()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Owned();

	/**
	 * Returns the meta object for the containment reference list '{@link MicroservicesArchitecture.MicroService#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Require</em>'.
	 * @see MicroservicesArchitecture.MicroService#getRequire()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Require();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.MicroService#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MicroservicesArchitecture.MicroService#getType()
	 * @see #getMicroService()
	 * @generated
	 */
	EAttribute getMicroService_Type();

	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see MicroservicesArchitecture.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the reference list '{@link MicroservicesArchitecture.Cluster#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see MicroservicesArchitecture.Cluster#getContains()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Contains();

	/**
	 * Returns the meta object for the container reference '{@link MicroservicesArchitecture.Cluster#getDivide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Divide</em>'.
	 * @see MicroservicesArchitecture.Cluster#getDivide()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Divide();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Cluster#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see MicroservicesArchitecture.Cluster#getContext()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_Context();

	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developer</em>'.
	 * @see MicroservicesArchitecture.Developer
	 * @generated
	 */
	EClass getDeveloper();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Developer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see MicroservicesArchitecture.Developer#getEmail()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Email();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Developer#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see MicroservicesArchitecture.Developer#getUsername()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Username();

	/**
	 * Returns the meta object for the container reference '{@link MicroservicesArchitecture.Developer#getWorksFor <em>Works For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Works For</em>'.
	 * @see MicroservicesArchitecture.Developer#getWorksFor()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_WorksFor();

	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see MicroservicesArchitecture.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the container reference '{@link MicroservicesArchitecture.Interface#getExposedBy <em>Exposed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Exposed By</em>'.
	 * @see MicroservicesArchitecture.Interface#getExposedBy()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ExposedBy();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Interface#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Point</em>'.
	 * @see MicroservicesArchitecture.Interface#getEndPoint()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_EndPoint();

	/**
	 * Returns the meta object for the attribute '{@link MicroservicesArchitecture.Interface#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see MicroservicesArchitecture.Interface#getPort()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Port();

	/**
	 * Returns the meta object for the container reference '{@link MicroservicesArchitecture.Interface#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Required By</em>'.
	 * @see MicroservicesArchitecture.Interface#getRequiredBy()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_RequiredBy();

	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see MicroservicesArchitecture.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link MicroservicesArchitecture.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see MicroservicesArchitecture.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link MicroservicesArchitecture.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see MicroservicesArchitecture.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the container reference '{@link MicroservicesArchitecture.Link#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Dependency</em>'.
	 * @see MicroservicesArchitecture.Link#getDependency()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Dependency();

	/**
	 * Returns the meta object for class '{@link MicroservicesArchitecture.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see MicroservicesArchitecture.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the reference list '{@link MicroservicesArchitecture.Team#getComposedBy <em>Composed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composed By</em>'.
	 * @see MicroservicesArchitecture.Team#getComposedBy()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_ComposedBy();

	/**
	 * Returns the meta object for the reference list '{@link MicroservicesArchitecture.Team#getWorkOn <em>Work On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work On</em>'.
	 * @see MicroservicesArchitecture.Team#getWorkOn()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_WorkOn();

	/**
	 * Returns the meta object for the container reference '{@link MicroservicesArchitecture.Team#getWorkFor <em>Work For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Work For</em>'.
	 * @see MicroservicesArchitecture.Team#getWorkFor()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_WorkFor();

	/**
	 * Returns the meta object for enum '{@link MicroservicesArchitecture.serviceType <em>service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>service Type</em>'.
	 * @see MicroservicesArchitecture.serviceType
	 * @generated
	 */
	EEnum getserviceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MicroservicesArchitectureFactory getMicroservicesArchitectureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.ElementImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.ProductImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Composed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__COMPOSED_BY = eINSTANCE.getProduct_ComposedBy();

		/**
		 * The meta object literal for the '<em><b>Divided In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__DIVIDED_IN = eINSTANCE.getProduct_DividedIn();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TEAMS = eINSTANCE.getProduct_Teams();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__LINKS = eINSTANCE.getProduct_Links();

		/**
		 * The meta object literal for the '<em><b>Developers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__DEVELOPERS = eINSTANCE.getProduct_Developers();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__URL = eINSTANCE.getProduct_Url();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.MicroServiceImpl <em>Micro Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.MicroServiceImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getMicroService()
		 * @generated
		 */
		EClass MICRO_SERVICE = eINSTANCE.getMicroService();

		/**
		 * The meta object literal for the '<em><b>Compose</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__COMPOSE = eINSTANCE.getMicroService_Compose();

		/**
		 * The meta object literal for the '<em><b>Belong To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__BELONG_TO = eINSTANCE.getMicroService_BelongTo();

		/**
		 * The meta object literal for the '<em><b>Expose</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__EXPOSE = eINSTANCE.getMicroService_Expose();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICRO_SERVICE__HOST = eINSTANCE.getMicroService_Host();

		/**
		 * The meta object literal for the '<em><b>Owned</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__OWNED = eINSTANCE.getMicroService_Owned();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__REQUIRE = eINSTANCE.getMicroService_Require();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICRO_SERVICE__TYPE = eINSTANCE.getMicroService_Type();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.ClusterImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__CONTAINS = eINSTANCE.getCluster_Contains();

		/**
		 * The meta object literal for the '<em><b>Divide</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__DIVIDE = eINSTANCE.getCluster_Divide();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__CONTEXT = eINSTANCE.getCluster_Context();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.DeveloperImpl <em>Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.DeveloperImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getDeveloper()
		 * @generated
		 */
		EClass DEVELOPER = eINSTANCE.getDeveloper();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__EMAIL = eINSTANCE.getDeveloper_Email();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__USERNAME = eINSTANCE.getDeveloper_Username();

		/**
		 * The meta object literal for the '<em><b>Works For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__WORKS_FOR = eINSTANCE.getDeveloper_WorksFor();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.InterfaceImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Exposed By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__EXPOSED_BY = eINSTANCE.getInterface_ExposedBy();

		/**
		 * The meta object literal for the '<em><b>End Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__END_POINT = eINSTANCE.getInterface_EndPoint();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__PORT = eINSTANCE.getInterface_Port();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__REQUIRED_BY = eINSTANCE.getInterface_RequiredBy();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.LinkImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__DEPENDENCY = eINSTANCE.getLink_Dependency();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.impl.TeamImpl
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Composed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__COMPOSED_BY = eINSTANCE.getTeam_ComposedBy();

		/**
		 * The meta object literal for the '<em><b>Work On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__WORK_ON = eINSTANCE.getTeam_WorkOn();

		/**
		 * The meta object literal for the '<em><b>Work For</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__WORK_FOR = eINSTANCE.getTeam_WorkFor();

		/**
		 * The meta object literal for the '{@link MicroservicesArchitecture.serviceType <em>service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MicroservicesArchitecture.serviceType
		 * @see MicroservicesArchitecture.impl.MicroservicesArchitecturePackageImpl#getserviceType()
		 * @generated
		 */
		EEnum SERVICE_TYPE = eINSTANCE.getserviceType();

	}

} //MicroservicesArchitecturePackage

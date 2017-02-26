/**
 */
package MicroservicesArchitecture.impl;

import MicroservicesArchitecture.Cluster;
import MicroservicesArchitecture.Developer;
import MicroservicesArchitecture.Link;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.MicroservicesArchitecturePackage;
import MicroservicesArchitecture.Product;
import MicroservicesArchitecture.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.impl.ProductImpl#getComposedBy <em>Composed By</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.ProductImpl#getDividedIn <em>Divided In</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.ProductImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.ProductImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.ProductImpl#getDevelopers <em>Developers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends ElementImpl implements Product {
	/**
	 * The cached value of the '{@link #getComposedBy() <em>Composed By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<MicroService> composedBy;

	/**
	 * The cached value of the '{@link #getDividedIn() <em>Divided In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDividedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Cluster> dividedIn;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getDevelopers() <em>Developers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopers()
	 * @generated
	 * @ordered
	 */
	protected EList<Developer> developers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesArchitecturePackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicroService> getComposedBy() {
		if (composedBy == null) {
			composedBy = new EObjectContainmentWithInverseEList<MicroService>(MicroService.class, this, MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY, MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE);
		}
		return composedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cluster> getDividedIn() {
		if (dividedIn == null) {
			dividedIn = new EObjectContainmentWithInverseEList<Cluster>(Cluster.class, this, MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN, MicroservicesArchitecturePackage.CLUSTER__DIVIDE);
		}
		return dividedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentWithInverseEList<Team>(Team.class, this, MicroservicesArchitecturePackage.PRODUCT__TEAMS, MicroservicesArchitecturePackage.TEAM__WORK_FOR);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<Link>(Link.class, this, MicroservicesArchitecturePackage.PRODUCT__LINKS, MicroservicesArchitecturePackage.LINK__DEPENDENCY);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Developer> getDevelopers() {
		if (developers == null) {
			developers = new EObjectContainmentWithInverseEList<Developer>(Developer.class, this, MicroservicesArchitecturePackage.PRODUCT__DEVELOPERS, MicroservicesArchitecturePackage.DEVELOPER__WORKS_FOR);
		}
		return developers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComposedBy()).basicAdd(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDividedIn()).basicAdd(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__DEVELOPERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevelopers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY:
				return ((InternalEList<?>)getComposedBy()).basicRemove(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN:
				return ((InternalEList<?>)getDividedIn()).basicRemove(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case MicroservicesArchitecturePackage.PRODUCT__DEVELOPERS:
				return ((InternalEList<?>)getDevelopers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY:
				return getComposedBy();
			case MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN:
				return getDividedIn();
			case MicroservicesArchitecturePackage.PRODUCT__TEAMS:
				return getTeams();
			case MicroservicesArchitecturePackage.PRODUCT__LINKS:
				return getLinks();
			case MicroservicesArchitecturePackage.PRODUCT__DEVELOPERS:
				return getDevelopers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY:
				getComposedBy().clear();
				getComposedBy().addAll((Collection<? extends MicroService>)newValue);
				return;
			case MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN:
				getDividedIn().clear();
				getDividedIn().addAll((Collection<? extends Cluster>)newValue);
				return;
			case MicroservicesArchitecturePackage.PRODUCT__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case MicroservicesArchitecturePackage.PRODUCT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case MicroservicesArchitecturePackage.PRODUCT__DEVELOPERS:
				getDevelopers().clear();
				getDevelopers().addAll((Collection<? extends Developer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY:
				getComposedBy().clear();
				return;
			case MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN:
				getDividedIn().clear();
				return;
			case MicroservicesArchitecturePackage.PRODUCT__TEAMS:
				getTeams().clear();
				return;
			case MicroservicesArchitecturePackage.PRODUCT__LINKS:
				getLinks().clear();
				return;
			case MicroservicesArchitecturePackage.PRODUCT__DEVELOPERS:
				getDevelopers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY:
				return composedBy != null && !composedBy.isEmpty();
			case MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN:
				return dividedIn != null && !dividedIn.isEmpty();
			case MicroservicesArchitecturePackage.PRODUCT__TEAMS:
				return teams != null && !teams.isEmpty();
			case MicroservicesArchitecturePackage.PRODUCT__LINKS:
				return links != null && !links.isEmpty();
			case MicroservicesArchitecturePackage.PRODUCT__DEVELOPERS:
				return developers != null && !developers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl

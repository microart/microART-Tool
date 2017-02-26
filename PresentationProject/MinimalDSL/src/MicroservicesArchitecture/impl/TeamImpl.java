/**
 */
package MicroservicesArchitecture.impl;

import MicroservicesArchitecture.Developer;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.MicroservicesArchitecturePackage;
import MicroservicesArchitecture.Product;
import MicroservicesArchitecture.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.impl.TeamImpl#getComposedBy <em>Composed By</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.TeamImpl#getWorkOn <em>Work On</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.TeamImpl#getWorkFor <em>Work For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends ElementImpl implements Team {
	/**
	 * The cached value of the '{@link #getComposedBy() <em>Composed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Developer> composedBy;

	/**
	 * The cached value of the '{@link #getWorkOn() <em>Work On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkOn()
	 * @generated
	 * @ordered
	 */
	protected EList<MicroService> workOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesArchitecturePackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Developer> getComposedBy() {
		if (composedBy == null) {
			composedBy = new EObjectResolvingEList<Developer>(Developer.class, this, MicroservicesArchitecturePackage.TEAM__COMPOSED_BY);
		}
		return composedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicroService> getWorkOn() {
		if (workOn == null) {
			workOn = new EObjectWithInverseResolvingEList<MicroService>(MicroService.class, this, MicroservicesArchitecturePackage.TEAM__WORK_ON, MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED);
		}
		return workOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getWorkFor() {
		if (eContainerFeatureID() != MicroservicesArchitecturePackage.TEAM__WORK_FOR) return null;
		return (Product)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkFor(Product newWorkFor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkFor, MicroservicesArchitecturePackage.TEAM__WORK_FOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkFor(Product newWorkFor) {
		if (newWorkFor != eInternalContainer() || (eContainerFeatureID() != MicroservicesArchitecturePackage.TEAM__WORK_FOR && newWorkFor != null)) {
			if (EcoreUtil.isAncestor(this, newWorkFor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkFor != null)
				msgs = ((InternalEObject)newWorkFor).eInverseAdd(this, MicroservicesArchitecturePackage.PRODUCT__TEAMS, Product.class, msgs);
			msgs = basicSetWorkFor(newWorkFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.TEAM__WORK_FOR, newWorkFor, newWorkFor));
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
			case MicroservicesArchitecturePackage.TEAM__WORK_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkOn()).basicAdd(otherEnd, msgs);
			case MicroservicesArchitecturePackage.TEAM__WORK_FOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkFor((Product)otherEnd, msgs);
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
			case MicroservicesArchitecturePackage.TEAM__WORK_ON:
				return ((InternalEList<?>)getWorkOn()).basicRemove(otherEnd, msgs);
			case MicroservicesArchitecturePackage.TEAM__WORK_FOR:
				return basicSetWorkFor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MicroservicesArchitecturePackage.TEAM__WORK_FOR:
				return eInternalContainer().eInverseRemove(this, MicroservicesArchitecturePackage.PRODUCT__TEAMS, Product.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.TEAM__COMPOSED_BY:
				return getComposedBy();
			case MicroservicesArchitecturePackage.TEAM__WORK_ON:
				return getWorkOn();
			case MicroservicesArchitecturePackage.TEAM__WORK_FOR:
				return getWorkFor();
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
			case MicroservicesArchitecturePackage.TEAM__COMPOSED_BY:
				getComposedBy().clear();
				getComposedBy().addAll((Collection<? extends Developer>)newValue);
				return;
			case MicroservicesArchitecturePackage.TEAM__WORK_ON:
				getWorkOn().clear();
				getWorkOn().addAll((Collection<? extends MicroService>)newValue);
				return;
			case MicroservicesArchitecturePackage.TEAM__WORK_FOR:
				setWorkFor((Product)newValue);
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
			case MicroservicesArchitecturePackage.TEAM__COMPOSED_BY:
				getComposedBy().clear();
				return;
			case MicroservicesArchitecturePackage.TEAM__WORK_ON:
				getWorkOn().clear();
				return;
			case MicroservicesArchitecturePackage.TEAM__WORK_FOR:
				setWorkFor((Product)null);
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
			case MicroservicesArchitecturePackage.TEAM__COMPOSED_BY:
				return composedBy != null && !composedBy.isEmpty();
			case MicroservicesArchitecturePackage.TEAM__WORK_ON:
				return workOn != null && !workOn.isEmpty();
			case MicroservicesArchitecturePackage.TEAM__WORK_FOR:
				return getWorkFor() != null;
		}
		return super.eIsSet(featureID);
	}

} //TeamImpl

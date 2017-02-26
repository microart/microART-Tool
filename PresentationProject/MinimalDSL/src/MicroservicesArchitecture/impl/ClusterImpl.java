/**
 */
package MicroservicesArchitecture.impl;

import MicroservicesArchitecture.Cluster;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.MicroservicesArchitecturePackage;
import MicroservicesArchitecture.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.impl.ClusterImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.ClusterImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.ClusterImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends ElementImpl implements Cluster {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<MicroService> contains;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesArchitecturePackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicroService> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<MicroService>(MicroService.class, this, MicroservicesArchitecturePackage.CLUSTER__CONTAINS, MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getDivide() {
		if (eContainerFeatureID() != MicroservicesArchitecturePackage.CLUSTER__DIVIDE) return null;
		return (Product)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivide(Product newDivide, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDivide, MicroservicesArchitecturePackage.CLUSTER__DIVIDE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivide(Product newDivide) {
		if (newDivide != eInternalContainer() || (eContainerFeatureID() != MicroservicesArchitecturePackage.CLUSTER__DIVIDE && newDivide != null)) {
			if (EcoreUtil.isAncestor(this, newDivide))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDivide != null)
				msgs = ((InternalEObject)newDivide).eInverseAdd(this, MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN, Product.class, msgs);
			msgs = basicSetDivide(newDivide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.CLUSTER__DIVIDE, newDivide, newDivide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.CLUSTER__CONTEXT, oldContext, context));
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
			case MicroservicesArchitecturePackage.CLUSTER__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case MicroservicesArchitecturePackage.CLUSTER__DIVIDE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDivide((Product)otherEnd, msgs);
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
			case MicroservicesArchitecturePackage.CLUSTER__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case MicroservicesArchitecturePackage.CLUSTER__DIVIDE:
				return basicSetDivide(null, msgs);
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
			case MicroservicesArchitecturePackage.CLUSTER__DIVIDE:
				return eInternalContainer().eInverseRemove(this, MicroservicesArchitecturePackage.PRODUCT__DIVIDED_IN, Product.class, msgs);
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
			case MicroservicesArchitecturePackage.CLUSTER__CONTAINS:
				return getContains();
			case MicroservicesArchitecturePackage.CLUSTER__DIVIDE:
				return getDivide();
			case MicroservicesArchitecturePackage.CLUSTER__CONTEXT:
				return getContext();
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
			case MicroservicesArchitecturePackage.CLUSTER__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends MicroService>)newValue);
				return;
			case MicroservicesArchitecturePackage.CLUSTER__DIVIDE:
				setDivide((Product)newValue);
				return;
			case MicroservicesArchitecturePackage.CLUSTER__CONTEXT:
				setContext((String)newValue);
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
			case MicroservicesArchitecturePackage.CLUSTER__CONTAINS:
				getContains().clear();
				return;
			case MicroservicesArchitecturePackage.CLUSTER__DIVIDE:
				setDivide((Product)null);
				return;
			case MicroservicesArchitecturePackage.CLUSTER__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
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
			case MicroservicesArchitecturePackage.CLUSTER__CONTAINS:
				return contains != null && !contains.isEmpty();
			case MicroservicesArchitecturePackage.CLUSTER__DIVIDE:
				return getDivide() != null;
			case MicroservicesArchitecturePackage.CLUSTER__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //ClusterImpl

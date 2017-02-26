/**
 */
package MicroservicesArchitecture.impl;

import MicroservicesArchitecture.Interface;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.MicroservicesArchitecturePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.impl.InterfaceImpl#getExposedBy <em>Exposed By</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.InterfaceImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.InterfaceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.InterfaceImpl#getRequiredBy <em>Required By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ElementImpl implements Interface {
	/**
	 * The default value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String END_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected String endPoint = END_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesArchitecturePackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroService getExposedBy() {
		if (eContainerFeatureID() != MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY) return null;
		return (MicroService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposedBy(MicroService newExposedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExposedBy, MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposedBy(MicroService newExposedBy) {
		if (newExposedBy != eInternalContainer() || (eContainerFeatureID() != MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY && newExposedBy != null)) {
			if (EcoreUtil.isAncestor(this, newExposedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExposedBy != null)
				msgs = ((InternalEObject)newExposedBy).eInverseAdd(this, MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE, MicroService.class, msgs);
			msgs = basicSetExposedBy(newExposedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY, newExposedBy, newExposedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPoint(String newEndPoint) {
		String oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.INTERFACE__END_POINT, oldEndPoint, endPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.INTERFACE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroService getRequiredBy() {
		if (eContainerFeatureID() != MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY) return null;
		return (MicroService)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredBy(MicroService newRequiredBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRequiredBy, MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredBy(MicroService newRequiredBy) {
		if (newRequiredBy != eInternalContainer() || (eContainerFeatureID() != MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY && newRequiredBy != null)) {
			if (EcoreUtil.isAncestor(this, newRequiredBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequiredBy != null)
				msgs = ((InternalEObject)newRequiredBy).eInverseAdd(this, MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE, MicroService.class, msgs);
			msgs = basicSetRequiredBy(newRequiredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY, newRequiredBy, newRequiredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExposedBy((MicroService)otherEnd, msgs);
			case MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRequiredBy((MicroService)otherEnd, msgs);
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
			case MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY:
				return basicSetExposedBy(null, msgs);
			case MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY:
				return basicSetRequiredBy(null, msgs);
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
			case MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY:
				return eInternalContainer().eInverseRemove(this, MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE, MicroService.class, msgs);
			case MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY:
				return eInternalContainer().eInverseRemove(this, MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE, MicroService.class, msgs);
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
			case MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY:
				return getExposedBy();
			case MicroservicesArchitecturePackage.INTERFACE__END_POINT:
				return getEndPoint();
			case MicroservicesArchitecturePackage.INTERFACE__PORT:
				return getPort();
			case MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY:
				return getRequiredBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY:
				setExposedBy((MicroService)newValue);
				return;
			case MicroservicesArchitecturePackage.INTERFACE__END_POINT:
				setEndPoint((String)newValue);
				return;
			case MicroservicesArchitecturePackage.INTERFACE__PORT:
				setPort((Integer)newValue);
				return;
			case MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY:
				setRequiredBy((MicroService)newValue);
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
			case MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY:
				setExposedBy((MicroService)null);
				return;
			case MicroservicesArchitecturePackage.INTERFACE__END_POINT:
				setEndPoint(END_POINT_EDEFAULT);
				return;
			case MicroservicesArchitecturePackage.INTERFACE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY:
				setRequiredBy((MicroService)null);
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
			case MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY:
				return getExposedBy() != null;
			case MicroservicesArchitecturePackage.INTERFACE__END_POINT:
				return END_POINT_EDEFAULT == null ? endPoint != null : !END_POINT_EDEFAULT.equals(endPoint);
			case MicroservicesArchitecturePackage.INTERFACE__PORT:
				return port != PORT_EDEFAULT;
			case MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY:
				return getRequiredBy() != null;
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
		result.append(" (endPoint: ");
		result.append(endPoint);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl

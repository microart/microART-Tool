/**
 */
package MicroservicesArchitecture.impl;

import MicroservicesArchitecture.Cluster;
import MicroservicesArchitecture.Interface;
import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.MicroservicesArchitecturePackage;
import MicroservicesArchitecture.Product;
import MicroservicesArchitecture.Team;
import MicroservicesArchitecture.serviceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Micro Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.impl.MicroServiceImpl#getCompose <em>Compose</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.MicroServiceImpl#getBelongTo <em>Belong To</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.MicroServiceImpl#getExpose <em>Expose</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.MicroServiceImpl#getHost <em>Host</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.MicroServiceImpl#getOwned <em>Owned</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.MicroServiceImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.MicroServiceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroServiceImpl extends ElementImpl implements MicroService {
	/**
	 * The cached value of the '{@link #getBelongTo() <em>Belong To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongTo()
	 * @generated
	 * @ordered
	 */
	protected Cluster belongTo;

	/**
	 * The cached value of the '{@link #getExpose() <em>Expose</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> expose;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwned() <em>Owned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwned()
	 * @generated
	 * @ordered
	 */
	protected Team owned;

	/**
	 * The cached value of the '{@link #getRequire() <em>Require</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequire()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> require;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final serviceType TYPE_EDEFAULT = serviceType.FUNCTIONAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected serviceType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesArchitecturePackage.Literals.MICRO_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getCompose() {
		if (eContainerFeatureID() != MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE) return null;
		return (Product)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompose(Product newCompose, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompose, MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompose(Product newCompose) {
		if (newCompose != eInternalContainer() || (eContainerFeatureID() != MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE && newCompose != null)) {
			if (EcoreUtil.isAncestor(this, newCompose))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompose != null)
				msgs = ((InternalEObject)newCompose).eInverseAdd(this, MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY, Product.class, msgs);
			msgs = basicSetCompose(newCompose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE, newCompose, newCompose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getBelongTo() {
		if (belongTo != null && belongTo.eIsProxy()) {
			InternalEObject oldBelongTo = (InternalEObject)belongTo;
			belongTo = (Cluster)eResolveProxy(oldBelongTo);
			if (belongTo != oldBelongTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO, oldBelongTo, belongTo));
			}
		}
		return belongTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetBelongTo() {
		return belongTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongTo(Cluster newBelongTo, NotificationChain msgs) {
		Cluster oldBelongTo = belongTo;
		belongTo = newBelongTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO, oldBelongTo, newBelongTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongTo(Cluster newBelongTo) {
		if (newBelongTo != belongTo) {
			NotificationChain msgs = null;
			if (belongTo != null)
				msgs = ((InternalEObject)belongTo).eInverseRemove(this, MicroservicesArchitecturePackage.CLUSTER__CONTAINS, Cluster.class, msgs);
			if (newBelongTo != null)
				msgs = ((InternalEObject)newBelongTo).eInverseAdd(this, MicroservicesArchitecturePackage.CLUSTER__CONTAINS, Cluster.class, msgs);
			msgs = basicSetBelongTo(newBelongTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO, newBelongTo, newBelongTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getExpose() {
		if (expose == null) {
			expose = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this, MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE, MicroservicesArchitecturePackage.INTERFACE__EXPOSED_BY);
		}
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.MICRO_SERVICE__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getOwned() {
		if (owned != null && owned.eIsProxy()) {
			InternalEObject oldOwned = (InternalEObject)owned;
			owned = (Team)eResolveProxy(oldOwned);
			if (owned != oldOwned) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED, oldOwned, owned));
			}
		}
		return owned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetOwned() {
		return owned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwned(Team newOwned, NotificationChain msgs) {
		Team oldOwned = owned;
		owned = newOwned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED, oldOwned, newOwned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwned(Team newOwned) {
		if (newOwned != owned) {
			NotificationChain msgs = null;
			if (owned != null)
				msgs = ((InternalEObject)owned).eInverseRemove(this, MicroservicesArchitecturePackage.TEAM__WORK_ON, Team.class, msgs);
			if (newOwned != null)
				msgs = ((InternalEObject)newOwned).eInverseAdd(this, MicroservicesArchitecturePackage.TEAM__WORK_ON, Team.class, msgs);
			msgs = basicSetOwned(newOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED, newOwned, newOwned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequire() {
		if (require == null) {
			require = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this, MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE, MicroservicesArchitecturePackage.INTERFACE__REQUIRED_BY);
		}
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public serviceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(serviceType newType) {
		serviceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.MICRO_SERVICE__TYPE, oldType, type));
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
			case MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompose((Product)otherEnd, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO:
				if (belongTo != null)
					msgs = ((InternalEObject)belongTo).eInverseRemove(this, MicroservicesArchitecturePackage.CLUSTER__CONTAINS, Cluster.class, msgs);
				return basicSetBelongTo((Cluster)otherEnd, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpose()).basicAdd(otherEnd, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED:
				if (owned != null)
					msgs = ((InternalEObject)owned).eInverseRemove(this, MicroservicesArchitecturePackage.TEAM__WORK_ON, Team.class, msgs);
				return basicSetOwned((Team)otherEnd, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequire()).basicAdd(otherEnd, msgs);
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
			case MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE:
				return basicSetCompose(null, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO:
				return basicSetBelongTo(null, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE:
				return ((InternalEList<?>)getExpose()).basicRemove(otherEnd, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED:
				return basicSetOwned(null, msgs);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE:
				return ((InternalEList<?>)getRequire()).basicRemove(otherEnd, msgs);
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
			case MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE:
				return eInternalContainer().eInverseRemove(this, MicroservicesArchitecturePackage.PRODUCT__COMPOSED_BY, Product.class, msgs);
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
			case MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE:
				return getCompose();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO:
				if (resolve) return getBelongTo();
				return basicGetBelongTo();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE:
				return getExpose();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__HOST:
				return getHost();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED:
				if (resolve) return getOwned();
				return basicGetOwned();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE:
				return getRequire();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__TYPE:
				return getType();
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
			case MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE:
				setCompose((Product)newValue);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO:
				setBelongTo((Cluster)newValue);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE:
				getExpose().clear();
				getExpose().addAll((Collection<? extends Interface>)newValue);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__HOST:
				setHost((String)newValue);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED:
				setOwned((Team)newValue);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE:
				getRequire().clear();
				getRequire().addAll((Collection<? extends Interface>)newValue);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__TYPE:
				setType((serviceType)newValue);
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
			case MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE:
				setCompose((Product)null);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO:
				setBelongTo((Cluster)null);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE:
				getExpose().clear();
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED:
				setOwned((Team)null);
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE:
				getRequire().clear();
				return;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MicroservicesArchitecturePackage.MICRO_SERVICE__COMPOSE:
				return getCompose() != null;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__BELONG_TO:
				return belongTo != null;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__EXPOSE:
				return expose != null && !expose.isEmpty();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case MicroservicesArchitecturePackage.MICRO_SERVICE__OWNED:
				return owned != null;
			case MicroservicesArchitecturePackage.MICRO_SERVICE__REQUIRE:
				return require != null && !require.isEmpty();
			case MicroservicesArchitecturePackage.MICRO_SERVICE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (host: ");
		result.append(host);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MicroServiceImpl

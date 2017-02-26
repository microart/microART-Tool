/**
 */
package MicroservicesArchitecture.impl;

import MicroservicesArchitecture.Interface;
import MicroservicesArchitecture.Link;
import MicroservicesArchitecture.MicroservicesArchitecturePackage;
import MicroservicesArchitecture.Product;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.impl.LinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.LinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link MicroservicesArchitecture.impl.LinkImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends ElementImpl implements Link {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Interface source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Interface target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesArchitecturePackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Interface)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroservicesArchitecturePackage.LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Interface newSource) {
		Interface oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.LINK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Interface)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MicroservicesArchitecturePackage.LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Interface newTarget) {
		Interface oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.LINK__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getDependency() {
		if (eContainerFeatureID() != MicroservicesArchitecturePackage.LINK__DEPENDENCY) return null;
		return (Product)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependency(Product newDependency, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDependency, MicroservicesArchitecturePackage.LINK__DEPENDENCY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(Product newDependency) {
		if (newDependency != eInternalContainer() || (eContainerFeatureID() != MicroservicesArchitecturePackage.LINK__DEPENDENCY && newDependency != null)) {
			if (EcoreUtil.isAncestor(this, newDependency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDependency != null)
				msgs = ((InternalEObject)newDependency).eInverseAdd(this, MicroservicesArchitecturePackage.PRODUCT__LINKS, Product.class, msgs);
			msgs = basicSetDependency(newDependency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesArchitecturePackage.LINK__DEPENDENCY, newDependency, newDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicroservicesArchitecturePackage.LINK__DEPENDENCY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDependency((Product)otherEnd, msgs);
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
			case MicroservicesArchitecturePackage.LINK__DEPENDENCY:
				return basicSetDependency(null, msgs);
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
			case MicroservicesArchitecturePackage.LINK__DEPENDENCY:
				return eInternalContainer().eInverseRemove(this, MicroservicesArchitecturePackage.PRODUCT__LINKS, Product.class, msgs);
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
			case MicroservicesArchitecturePackage.LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case MicroservicesArchitecturePackage.LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case MicroservicesArchitecturePackage.LINK__DEPENDENCY:
				return getDependency();
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
			case MicroservicesArchitecturePackage.LINK__SOURCE:
				setSource((Interface)newValue);
				return;
			case MicroservicesArchitecturePackage.LINK__TARGET:
				setTarget((Interface)newValue);
				return;
			case MicroservicesArchitecturePackage.LINK__DEPENDENCY:
				setDependency((Product)newValue);
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
			case MicroservicesArchitecturePackage.LINK__SOURCE:
				setSource((Interface)null);
				return;
			case MicroservicesArchitecturePackage.LINK__TARGET:
				setTarget((Interface)null);
				return;
			case MicroservicesArchitecturePackage.LINK__DEPENDENCY:
				setDependency((Product)null);
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
			case MicroservicesArchitecturePackage.LINK__SOURCE:
				return source != null;
			case MicroservicesArchitecturePackage.LINK__TARGET:
				return target != null;
			case MicroservicesArchitecturePackage.LINK__DEPENDENCY:
				return getDependency() != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl

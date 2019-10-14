/**
 */
package Program.impl;

import Program.ProgramPackage;
import Program.Semester;
import Program.SemesterCourse;

import Program.SemesterStatus;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Program.impl.SemesterImpl#getName <em>Name</em>}</li>
 *   <li>{@link Program.impl.SemesterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link Program.impl.SemesterImpl#getSemesterCourses <em>Semester Courses</em>}</li>
 *   <li>{@link Program.impl.SemesterImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesterCourses() <em>Semester Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<SemesterCourse> semesterCourses;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterStatus STATUS_EDEFAULT = SemesterStatus.FALL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SemesterStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return "Semester " + code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.SEMESTER__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SemesterCourse> getSemesterCourses() {
		if (semesterCourses == null) {
			semesterCourses = new EObjectContainmentWithInverseEList<SemesterCourse>(SemesterCourse.class, this, ProgramPackage.SEMESTER__SEMESTER_COURSES, ProgramPackage.SEMESTER_COURSE__SEMESTER);
		}
		return semesterCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(SemesterStatus newStatus) {
		SemesterStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.SEMESTER__STATUS, oldStatus, status));
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
			case ProgramPackage.SEMESTER__SEMESTER_COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesterCourses()).basicAdd(otherEnd, msgs);
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
			case ProgramPackage.SEMESTER__SEMESTER_COURSES:
				return ((InternalEList<?>)getSemesterCourses()).basicRemove(otherEnd, msgs);
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
			case ProgramPackage.SEMESTER__NAME:
				return getName();
			case ProgramPackage.SEMESTER__CODE:
				return getCode();
			case ProgramPackage.SEMESTER__SEMESTER_COURSES:
				return getSemesterCourses();
			case ProgramPackage.SEMESTER__STATUS:
				return getStatus();
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
			case ProgramPackage.SEMESTER__CODE:
				setCode((String)newValue);
				return;
			case ProgramPackage.SEMESTER__SEMESTER_COURSES:
				getSemesterCourses().clear();
				getSemesterCourses().addAll((Collection<? extends SemesterCourse>)newValue);
				return;
			case ProgramPackage.SEMESTER__STATUS:
				setStatus((SemesterStatus)newValue);
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
			case ProgramPackage.SEMESTER__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ProgramPackage.SEMESTER__SEMESTER_COURSES:
				getSemesterCourses().clear();
				return;
			case ProgramPackage.SEMESTER__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case ProgramPackage.SEMESTER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProgramPackage.SEMESTER__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ProgramPackage.SEMESTER__SEMESTER_COURSES:
				return semesterCourses != null && !semesterCourses.isEmpty();
			case ProgramPackage.SEMESTER__STATUS:
				return status != STATUS_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl

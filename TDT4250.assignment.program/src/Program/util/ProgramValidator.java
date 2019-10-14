/**
 */
package Program.util;

import Program.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Program.ProgramPackage
 * @generated
 */
public class ProgramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProgramValidator INSTANCE = new ProgramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Program";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProgramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProgramPackage.PROGRAM:
				return validateProgram((Program)value, diagnostics, context);
			case ProgramPackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case ProgramPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case ProgramPackage.SEMESTER_COURSE:
				return validateSemesterCourse((SemesterCourse)value, diagnostics, context);
			case ProgramPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case ProgramPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case ProgramPackage.SEMESTER_STATUS:
				return validateSemesterStatus((SemesterStatus)value, diagnostics, context);
			case ProgramPackage.COURSE_STATUS:
				return validateCourseStatus((CourseStatus)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_minCredits(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_courseCodeFormat(course, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__MIN_CREDITS__EEXPRESSION = "self.credit->sum() >= 5.0";

	
	/**
	 * Validates the minCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_minCredits(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProgramPackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "minCredits",
				 COURSE__MIN_CREDITS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the courseCodeFormat constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourse_courseCodeFormat(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {

		String pattern = "[A-Z]{2,3}[1-9]{4}";
		if (!course.getCode().matches(pattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "courseCodeFormat", getObjectLabel(course, context) },
						 new Object[] { course },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterStatus(SemesterStatus semesterStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_min30Credits(semester, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the min30Credits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEMESTER__MIN30_CREDITS__EEXPRESSION = "self.semesterCourses.course.credit -> sum()  >= 30.0";

	/**
	 * Validates the min30Credits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_min30Credits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProgramPackage.Literals.SEMESTER,
				 semester,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "min30Credits",
				 SEMESTER__MIN30_CREDITS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterCourse(SemesterCourse semesterCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semesterCourse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseStatus(CourseStatus courseStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProgramValidator

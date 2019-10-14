/**
 */
package Program;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.SemesterCourse#getStatus <em>Status</em>}</li>
 *   <li>{@link Program.SemesterCourse#getCourse <em>Course</em>}</li>
 *   <li>{@link Program.SemesterCourse#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getSemesterCourse()
 * @model
 * @generated
 */
public interface SemesterCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Program.CourseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see Program.CourseStatus
	 * @see #setStatus(CourseStatus)
	 * @see Program.ProgramPackage#getSemesterCourse_Status()
	 * @model
	 * @generated
	 */
	CourseStatus getStatus();

	/**
	 * Sets the value of the '{@link Program.SemesterCourse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see Program.CourseStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CourseStatus value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see Program.ProgramPackage#getSemesterCourse_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link Program.SemesterCourse#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Program.Semester#getSemesterCourses <em>Semester Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' container reference.
	 * @see #setSemester(Semester)
	 * @see Program.ProgramPackage#getSemesterCourse_Semester()
	 * @see Program.Semester#getSemesterCourses
	 * @model opposite="semesterCourses" transient="false"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link Program.SemesterCourse#getSemester <em>Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' container reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // SemesterCourse

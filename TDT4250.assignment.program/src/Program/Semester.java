/**
 */
package Program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.Semester#getName <em>Name</em>}</li>
 *   <li>{@link Program.Semester#getCode <em>Code</em>}</li>
 *   <li>{@link Program.Semester#getSemesterCourses <em>Semester Courses</em>}</li>
 *   <li>{@link Program.Semester#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='min30Credits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 min30Credits='self.semesterCourses.course.credit -&gt; sum()  &gt;= 30.0'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Program.ProgramPackage#getSemester_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Program.ProgramPackage#getSemester_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Program.Semester#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Semester Courses</b></em>' containment reference list.
	 * The list contents are of type {@link Program.SemesterCourse}.
	 * It is bidirectional and its opposite is '{@link Program.SemesterCourse#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Courses</em>' containment reference list.
	 * @see Program.ProgramPackage#getSemester_SemesterCourses()
	 * @see Program.SemesterCourse#getSemester
	 * @model opposite="semester" containment="true"
	 * @generated
	 */
	EList<SemesterCourse> getSemesterCourses();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Program.SemesterStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see Program.SemesterStatus
	 * @see #setStatus(SemesterStatus)
	 * @see Program.ProgramPackage#getSemester_Status()
	 * @model
	 * @generated
	 */
	SemesterStatus getStatus();

	/**
	 * Sets the value of the '{@link Program.Semester#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see Program.SemesterStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SemesterStatus value);

} // Semester

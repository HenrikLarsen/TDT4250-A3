/**
 */
package Program;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.Course#getName <em>Name</em>}</li>
 *   <li>{@link Program.Course#getCode <em>Code</em>}</li>
 *   <li>{@link Program.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link Program.Course#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minCredits courseCodeFormat'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 minCredits='self.credit-&gt;sum() &gt;= 5.0'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Program.ProgramPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Program.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Program.ProgramPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Program.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(float)
	 * @see Program.ProgramPackage#getCourse_Credit()
	 * @model
	 * @generated
	 */
	float getCredit();

	/**
	 * Sets the value of the '{@link Program.Course#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(float value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Program.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see Program.ProgramPackage#getCourse_Department()
	 * @see Program.Department#getCourses
	 * @model opposite="courses" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link Program.Course#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

} // Course

/**
 */
package Program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.Department#getName <em>Name</em>}</li>
 *   <li>{@link Program.Department#getPrograms <em>Programs</em>}</li>
 *   <li>{@link Program.Department#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Program.ProgramPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Program.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link Program.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see Program.ProgramPackage#getDepartment_Programs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link Program.Course}.
	 * It is bidirectional and its opposite is '{@link Program.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see Program.ProgramPackage#getDepartment_Courses()
	 * @see Program.Course#getDepartment
	 * @model opposite="department" containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Department

/**
 */
package Program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.Program#getName <em>Name</em>}</li>
 *   <li>{@link Program.Program#getYear <em>Year</em>}</li>
 *   <li>{@link Program.Program#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link Program.Program#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Program.ProgramPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Program.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(float)
	 * @see Program.ProgramPackage#getProgram_Year()
	 * @model
	 * @generated
	 */
	float getYear();

	/**
	 * Sets the value of the '{@link Program.Program#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(float value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link Program.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see Program.ProgramPackage#getProgram_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link Program.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see Program.ProgramPackage#getProgram_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

} // Program

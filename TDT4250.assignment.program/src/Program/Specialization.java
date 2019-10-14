/**
 */
package Program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link Program.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link Program.Specialization#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Program.ProgramPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Program.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link Program.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see Program.ProgramPackage#getSpecialization_Semesters()
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
	 * @see Program.ProgramPackage#getSpecialization_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

} // Specialization

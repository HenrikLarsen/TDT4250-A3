/**
 */
package org.w3c.xhtml1;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.SelectType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOptgroup <em>Optgroup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOption <em>Option</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnblur <em>Onblur</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnchange <em>Onchange</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnfocus <em>Onfocus</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getSize <em>Size</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.w3c.xhtml1.SelectType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType()
 * @model extendedMetaData="name='select_._type' kind='elementOnly'"
 * @generated
 */
public interface SelectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Optgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.OptgroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       option group
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optgroup</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Optgroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='optgroup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OptgroupType> getOptgroup();

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.OptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       selectable choice
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Option()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='option' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OptionType> getOption();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.DirType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.w3c.xhtml1.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.w3c.xhtml1.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.SelectType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.SelectType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.DisabledType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see org.w3c.xhtml1.DisabledType
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #setDisabled(DisabledType)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Disabled()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disabled'"
	 * @generated
	 */
	DisabledType getDisabled();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see org.w3c.xhtml1.DisabledType
	 * @see #isSetDisabled()
	 * @see #unsetDisabled()
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(DisabledType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.SelectType#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(DisabledType)
	 * @generated
	 */
	void unsetDisabled();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.SelectType#getDisabled <em>Disabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disabled</em>' attribute is set.
	 * @see #unsetDisabled()
	 * @see #getDisabled()
	 * @see #setDisabled(DisabledType)
	 * @generated
	 */
	boolean isSetDisabled();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Lang()
	 * @model dataType="org.w3c.xhtml1.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content of the lang attribute is a hyphen-separated list of case-insensitive tokens where the first token, if one character, is "i" or "x"; if two characters, is an ISO 639-1 language code; if three characters, is an ISO 639-2 language code. The second token, if two characters, is an ISO 3166-1 country code; if from three to eight characters, is an IANA-registered language code. The meaning of other tokens is undefined. This documentation briefly summarizes  RFC3066, which obseletes RFC1766.
	 * 
	 * 	 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang1</em>' attribute.
	 * @see #setLang1(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Lang1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang1();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getLang1 <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang1</em>' attribute.
	 * @see #getLang1()
	 * @generated
	 */
	void setLang1(String value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.MultipleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see org.w3c.xhtml1.MultipleType
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #setMultiple(MultipleType)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Multiple()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multiple'"
	 * @generated
	 */
	MultipleType getMultiple();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see org.w3c.xhtml1.MultipleType
	 * @see #isSetMultiple()
	 * @see #unsetMultiple()
	 * @see #getMultiple()
	 * @generated
	 */
	void setMultiple(MultipleType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.SelectType#getMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiple()
	 * @see #getMultiple()
	 * @see #setMultiple(MultipleType)
	 * @generated
	 */
	void unsetMultiple();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.SelectType#getMultiple <em>Multiple</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple</em>' attribute is set.
	 * @see #unsetMultiple()
	 * @see #getMultiple()
	 * @see #setMultiple(MultipleType)
	 * @generated
	 */
	boolean isSetMultiple();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Onblur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onblur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onblur</em>' attribute.
	 * @see #setOnblur(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onblur()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onblur'"
	 * @generated
	 */
	String getOnblur();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnblur <em>Onblur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onblur</em>' attribute.
	 * @see #getOnblur()
	 * @generated
	 */
	void setOnblur(String value);

	/**
	 * Returns the value of the '<em><b>Onchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onchange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onchange</em>' attribute.
	 * @see #setOnchange(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onchange()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onchange'"
	 * @generated
	 */
	String getOnchange();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnchange <em>Onchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onchange</em>' attribute.
	 * @see #getOnchange()
	 * @generated
	 */
	void setOnchange(String value);

	/**
	 * Returns the value of the '<em><b>Onclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onclick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onclick</em>' attribute.
	 * @see #setOnclick(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onclick()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onclick'"
	 * @generated
	 */
	String getOnclick();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnclick <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onclick</em>' attribute.
	 * @see #getOnclick()
	 * @generated
	 */
	void setOnclick(String value);

	/**
	 * Returns the value of the '<em><b>Ondblclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ondblclick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ondblclick</em>' attribute.
	 * @see #setOndblclick(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Ondblclick()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='ondblclick'"
	 * @generated
	 */
	String getOndblclick();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOndblclick <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ondblclick</em>' attribute.
	 * @see #getOndblclick()
	 * @generated
	 */
	void setOndblclick(String value);

	/**
	 * Returns the value of the '<em><b>Onfocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onfocus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onfocus</em>' attribute.
	 * @see #setOnfocus(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onfocus()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onfocus'"
	 * @generated
	 */
	String getOnfocus();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnfocus <em>Onfocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onfocus</em>' attribute.
	 * @see #getOnfocus()
	 * @generated
	 */
	void setOnfocus(String value);

	/**
	 * Returns the value of the '<em><b>Onkeydown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onkeydown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeydown</em>' attribute.
	 * @see #setOnkeydown(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onkeydown()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeydown'"
	 * @generated
	 */
	String getOnkeydown();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnkeydown <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeydown</em>' attribute.
	 * @see #getOnkeydown()
	 * @generated
	 */
	void setOnkeydown(String value);

	/**
	 * Returns the value of the '<em><b>Onkeypress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onkeypress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeypress</em>' attribute.
	 * @see #setOnkeypress(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onkeypress()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeypress'"
	 * @generated
	 */
	String getOnkeypress();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnkeypress <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeypress</em>' attribute.
	 * @see #getOnkeypress()
	 * @generated
	 */
	void setOnkeypress(String value);

	/**
	 * Returns the value of the '<em><b>Onkeyup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onkeyup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeyup</em>' attribute.
	 * @see #setOnkeyup(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onkeyup()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeyup'"
	 * @generated
	 */
	String getOnkeyup();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnkeyup <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeyup</em>' attribute.
	 * @see #getOnkeyup()
	 * @generated
	 */
	void setOnkeyup(String value);

	/**
	 * Returns the value of the '<em><b>Onmousedown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmousedown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmousedown</em>' attribute.
	 * @see #setOnmousedown(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onmousedown()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmousedown'"
	 * @generated
	 */
	String getOnmousedown();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnmousedown <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmousedown</em>' attribute.
	 * @see #getOnmousedown()
	 * @generated
	 */
	void setOnmousedown(String value);

	/**
	 * Returns the value of the '<em><b>Onmousemove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmousemove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmousemove</em>' attribute.
	 * @see #setOnmousemove(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onmousemove()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmousemove'"
	 * @generated
	 */
	String getOnmousemove();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnmousemove <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmousemove</em>' attribute.
	 * @see #getOnmousemove()
	 * @generated
	 */
	void setOnmousemove(String value);

	/**
	 * Returns the value of the '<em><b>Onmouseout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmouseout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseout</em>' attribute.
	 * @see #setOnmouseout(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onmouseout()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseout'"
	 * @generated
	 */
	String getOnmouseout();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnmouseout <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseout</em>' attribute.
	 * @see #getOnmouseout()
	 * @generated
	 */
	void setOnmouseout(String value);

	/**
	 * Returns the value of the '<em><b>Onmouseover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmouseover</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseover</em>' attribute.
	 * @see #setOnmouseover(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onmouseover()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseover'"
	 * @generated
	 */
	String getOnmouseover();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnmouseover <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseover</em>' attribute.
	 * @see #getOnmouseover()
	 * @generated
	 */
	void setOnmouseover(String value);

	/**
	 * Returns the value of the '<em><b>Onmouseup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmouseup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseup</em>' attribute.
	 * @see #setOnmouseup(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Onmouseup()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseup'"
	 * @generated
	 */
	String getOnmouseup();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getOnmouseup <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseup</em>' attribute.
	 * @see #getOnmouseup()
	 * @generated
	 */
	void setOnmouseup(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(BigInteger)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Size()
	 * @model dataType="org.w3c.xhtml1.Number"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Style()
	 * @model dataType="org.w3c.xhtml1.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabindex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabindex</em>' attribute.
	 * @see #setTabindex(BigInteger)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Tabindex()
	 * @model dataType="org.w3c.xhtml1.TabindexNumber"
	 *        extendedMetaData="kind='attribute' name='tabindex'"
	 * @generated
	 */
	BigInteger getTabindex();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getTabindex <em>Tabindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabindex</em>' attribute.
	 * @see #getTabindex()
	 * @generated
	 */
	void setTabindex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getSelectType_Title()
	 * @model dataType="org.w3c.xhtml1.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.SelectType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // SelectType

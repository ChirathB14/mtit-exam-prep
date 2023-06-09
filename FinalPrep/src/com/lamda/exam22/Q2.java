package com.lamda.exam22;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;

/**
 * @author
 * 
 * This class demonstrates the creation of XML document using the DOM
 * API and generates additional Java classes.
 *
 */
public class Q2 {

	// constants for XML element and attribute names
	private static final String GENDER_ATTRIBUTE_NAME = "Gender";
	private static final String NAME_ELEMENT_NAME = "Name";
	private static final String SCHOOL_ELEMENT_NAME = "School";
	private static final String STUDENT_ELEMENT_NAME = "Students";
	private static final String INITIALS_ATTRIBUTE_NAME = "Initials";
	private static final String ADDRESS_ELEMENT_NAME = "Address";
	private static final String NO_ATTRIBUTE_NAME = "No";
	private static final String STREET_ATTRIBUTE_NAME = "Street";

	// output XML filename
	private static final String OUTPUT_FILENAME = "students.xml";
	
	// Attribute Values
	private static final String GENDER_ATTRIBUTE_VALUE = "male";
	private static final String INITIALS_ATTRIBUTE_VALUE = "S.A.";
	private static final String NAME_ELEMENT_VALUE = "Nalaka Dissanayaka";
	private static final String NO_ATTRIBUTE_VALUE = "115/1";
	private static final String STREET_ATTRIBUTE_VALUE = "Avenue Street";
	private static final String ADDRESS_ELEMENT_VALUE = "No: 115/1, Avenue Street, Kandy";

	public static Document createDocument() throws Exception {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		return documentBuilder.newDocument();
	}

	public static Element createElement(Document document, String name) throws Exception {
		return document.createElement(name);
	}

	public static void appendChild(Element rootElement, Element childElement) throws Exception {
		rootElement.appendChild(childElement);
	}

	public static void appendChild(Document document, Element Element, String value) throws Exception {
		Element.appendChild(document.createTextNode(value));
	}

	public static Attr createAttribute(Document document, String name) throws Exception {
		return document.createAttribute(name);
	}

	public static void setAtttributeForElement(Attr attribute, Element element, String value) throws Exception {
		attribute.setValue(value);
		element.setAttributeNode(attribute);
	}

	public static void transformToXml(Document document, String filename) throws Exception {
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer transformer = transFactory.newTransformer();
		
		DOMSource domSource = new DOMSource(document);

		StreamResult result = new StreamResult(new File(filename));

		transformer.transform(domSource, result);
		transformer.transform(domSource, new StreamResult(System.out));
	}

	public static void buildXmlFile() throws Exception {
		Document document = createDocument();

		Element schoolElement = createElement(document, SCHOOL_ELEMENT_NAME);
		document.appendChild(schoolElement);
		createElement(document, SCHOOL_ELEMENT_NAME);

		Element studentsElement = createElement(document, STUDENT_ELEMENT_NAME);
		appendChild(schoolElement, studentsElement);

		Attr genderAttribute = createAttribute(document, GENDER_ATTRIBUTE_NAME);
		setAtttributeForElement(genderAttribute, studentsElement, GENDER_ATTRIBUTE_VALUE);

		Element nameElement = createElement(document, NAME_ELEMENT_NAME);
		Attr initialsAtttribute = createAttribute(document, INITIALS_ATTRIBUTE_NAME);
		setAtttributeForElement(initialsAtttribute, nameElement, INITIALS_ATTRIBUTE_VALUE);

		appendChild(document, nameElement, NAME_ELEMENT_VALUE);
		appendChild(studentsElement, nameElement);

		Element addressElement = createElement(document, ADDRESS_ELEMENT_NAME);
		Attr noAttr = createAttribute(document, NO_ATTRIBUTE_NAME);
		setAtttributeForElement(noAttr, addressElement, NO_ATTRIBUTE_VALUE);

		Attr streetAttr = createAttribute(document, STREET_ATTRIBUTE_NAME);
		setAtttributeForElement(streetAttr, addressElement, STREET_ATTRIBUTE_VALUE);

		appendChild(document, addressElement, ADDRESS_ELEMENT_VALUE);
		appendChild(studentsElement, addressElement);

		transformToXml(document, OUTPUT_FILENAME);

	}


	public static void main(String[] args) throws Exception {
		try {
			buildXmlFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

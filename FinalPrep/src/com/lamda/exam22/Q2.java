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

	private static Document createDocument() throws Exception {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		return documentBuilder.newDocument();
	}

	private static Element createElement(Document document, String name) throws Exception {
		return document.createElement(name);
	}

	private static void appendChild(Element rootElement, Element childElement) throws Exception {
		rootElement.appendChild(childElement);
	}

	private static void appendChild(Document document, Element Element, String value) throws Exception {
		Element.appendChild(document.createTextNode(value));
	}

	private static Attr createAttribute(Document document, String name) throws Exception {
		return document.createAttribute(name);
	}

	private static void setAtttributeForElement(Attr attribute, Element element, String value) throws Exception {
		attribute.setValue(value);
		element.setAttributeNode(attribute);
	}

	private static DOMSource transformToXml(Document document) throws Exception {
		return new DOMSource(document);
	}

	private static void buildXmlFile(String filename, DOMSource domSource) throws Exception {
		TransformerFactory transFactory = TransformerFactory.newInstance();
		Transformer transformer = transFactory.newTransformer();

		StreamResult result = new StreamResult(new File(filename));

		transformer.transform(domSource, result);
		transformer.transform(domSource, new StreamResult(System.out));

	}

	private static void generateXmlFile() throws Exception {
		Document document = createDocument();

		Element schoolElement = createElement(document, SCHOOL_ELEMENT_NAME);
		document.appendChild(schoolElement);
		createElement(document, SCHOOL_ELEMENT_NAME);

		Element studentsElement = createElement(document, STUDENT_ELEMENT_NAME);
		appendChild(schoolElement, studentsElement);

		Attr genderAttribute = createAttribute(document, GENDER_ATTRIBUTE_NAME);
		setAtttributeForElement(genderAttribute, studentsElement, "male");

		Element nameElement = createElement(document, NAME_ELEMENT_NAME);
		Attr initialsAtttribute = createAttribute(document, INITIALS_ATTRIBUTE_NAME);
		setAtttributeForElement(initialsAtttribute, nameElement, "S.A.");

		appendChild(document, nameElement, "Nalaka Dissanayaka");
		appendChild(studentsElement, nameElement);

		Element addressElement = createElement(document, ADDRESS_ELEMENT_NAME);
		Attr noAttr = createAttribute(document, NO_ATTRIBUTE_NAME);
		setAtttributeForElement(noAttr, addressElement, "115/1");

		Attr streetAttr = createAttribute(document, STREET_ATTRIBUTE_NAME);
		setAtttributeForElement(streetAttr, addressElement, "Avenue Street");

		appendChild(document, addressElement, "No: 115/1, Avenue Street, Kandy");
		appendChild(studentsElement, addressElement);

		DOMSource source = transformToXml(document);

		buildXmlFile(OUTPUT_FILENAME, source);

	}

	public static void main(String[] args) throws Exception {
		try {
			generateXmlFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

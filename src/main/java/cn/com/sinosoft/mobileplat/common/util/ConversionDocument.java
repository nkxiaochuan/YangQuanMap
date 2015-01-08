package cn.com.sinosoft.mobileplat.common.util;

import java.io.*;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.jdom.*;

import org.jdom.input.*;
import org.jdom.output.*;

/**
 * 转换org.w3c.dom.Document。
 * 
 * @author 程凯
 */
public class ConversionDocument {

	/**
	 * 创建org.w3c.dom.Document
	 * @param xmlString
	 *            XML格式的字符串
	 * @return 返回建立的org.w3c.dom.Document对象，建立不成功返回null 。
	 * @throws Exception
	 */
	public static org.w3c.dom.Document createW3CDocument(String xmlString)
			throws Exception {
		Document document = buildFromXMLString(xmlString);

		if (document != null) {
			return outputToDom(document);
		} else {
			return null;
		}
	}

	/**
	 * 根据XML 字符串 建立JDom对象
	 * 
	 * @param xmlString
	 *            XML格式的字符串
	 * @return 返回建立的JDom对象，建立不成功返回null 。
	 * @throws Exception
	 */
	public static Document buildFromXMLString(String xmlString)
			throws Exception {
		try {
			SAXBuilder builder = new SAXBuilder();
			Document document = builder.build(new StringReader(xmlString));
			return document;
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将jdocument转换成org.w3c.dom.Document
	 * 
	 * @param jdomDoc
	 * @return
	 * @throws JDOMException
	 */
	public static org.w3c.dom.Document outputToDom(org.jdom.Document jdomDoc)
			throws JDOMException {
		org.jdom.output.DOMOutputter outputter = new org.jdom.output.DOMOutputter();
		return outputter.output(jdomDoc);
	}
}

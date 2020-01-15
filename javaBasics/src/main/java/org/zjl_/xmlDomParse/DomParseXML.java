package org.zjl_.xmlDomParse;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParseXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        // DOM解析；SAX解析；JDOM解析；DOM4J解析。
        // Document Object Model; Simple API for XML;
        // 前两种属于官方自带的解析方式，与平台无关；
        // 后两者是扩展方法(不仅实现了DOM、SAX同时有自己的功能实现)，只适用于Java平台。

        /*
         * DOM解析： 把整个的xml文档当成对象来进行处理，先把文档读取到内存 基于一个树形的结构 根 子1 子2 子1a 子1b 子2a 子2b
         */

        // javax.xml.parsers 包中的DocumentBuilderFactory用于创建DOM模式的解析器对象，
        // DocumentBuilderFactory是一个抽象工厂类，它不能直接实例化，但该类提供了一个newInstance方法 ，
        // 这个方法会根据本地平台默认安装的解析器，自动创建一个工厂的对象并返回。
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        // 调用工厂对象的 newDocumentBuilder方法得到 DOM 解析器对象。
        DocumentBuilder db = documentBuilderFactory.newDocumentBuilder();

        // 把要解析的 XML 文档转化为输入流，以便 DOM 解析器解析它
        Document document = db.parse(DomParseXML.class.getClassLoader()
                .getResourceAsStream("/Users/edz/javaCode/parseXML/zjlMaven/resources/student.xml"));
        NodeList nodeList = document.getElementsByTagName("student");
        Node node = nodeList.item(0);
        System.out.println(node.getLastChild().getFirstChild().getNodeValue());
    }
}

package com.javaSE.xml;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * 解析 xml
 *  属性文件 后缀是。Properties
 *
 */
public class DOMdemo {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("videos.xml");

        System.out.println(doc.getChildNodes().getLength());

        Element root = doc.getDocumentElement();
        System.out.println(root.getChildNodes().getLength());
        NodeList list = root.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            if (node instanceof Element) {
                System.out.println(node.getNodeName() + "，" + ((Element) node).getAttribute("id"));
                NamedNodeMap map = node.getAttributes();
                for (int j = 0; j < map.getLength(); j++) {
                    System.out.println(map.item(0).getNodeName() + "，" + map.item(0).getNodeValue());
                }
            }
        }
        NodeList titles = doc.getElementsByTagName("title");
        for (int i = 0; i < titles.getLength(); i++) {
            Node node = titles.item(i);
            System.out.println(node.getFirstChild().getNodeValue());
        }
    }
}

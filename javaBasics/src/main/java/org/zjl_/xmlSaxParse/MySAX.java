package org.zjl_.xmlSaxParse;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MySAX extends DefaultHandler {
    private List stuArrList;
    private String s;
    private Student stu;

    List getList() {
        return stuArrList;
    }

    @Override
    public void startDocument() throws SAXException {
        stuArrList = new ArrayList();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("结束解析");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName != null)
            s = qName;
        if (qName.equals("student"))
            stu = new Student();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = new String(ch, start, length);
        if (s != null) {
            if (s.equals("name"))
                stu.setName(str);
            if (s.equals("age"))
                stu.setAge(Integer.parseInt(str));
            if (s.equals("address"))
                stu.setAddress(str);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName != null)
            if (qName.equals("student"))
                stuArrList.add(stu);
        s = null;
    }
}

package org.zjl_.xmlDom4JParse;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4JParseXML {
    public static void main(String[] args) {
        // 通过 DOM4J 解析student.xml文件
        // 创建SAXReader的对象saxReader;
        SAXReader saxReader = new SAXReader();
        try {

            // 通过saxReader对象的read方法加载student.xml文件，获取Document对象
            Document docu = saxReader.read(new File("/Users/edz/javaCode/parseXML/zjlMaven/resources/student.xml"));

            // 通过docn对象的getRootElement方法获取 根结点students
            Element students = docu.getRootElement();

            // 通过element对象的elementIterator方法获取 迭代器
            Iterator stusIt = students.elementIterator();

            // 遍历迭代器，获取根结点中的信息(<student></student>)
            while (stusIt.hasNext()) {
                System.out.println("开始读取学生信息");
                Element student = (Element) stusIt.next();

                // 获取学生的属性名以及属性值
                // <元素(标签) 属性名="值">文本内容</元素(标签)>
                List<Attribute> stuAtribt = student.attributes();
                for (Attribute atribt : stuAtribt) {
                    System.out.println("属性名：" + atribt.getName() + "属性值：" + atribt.getValue());
                }

                // 获取student节点名和节点值<name>,<age>,<address>
                Iterator stuIt = student.elementIterator();
                while (stuIt.hasNext()) {
                    Element stuInfo = (Element) stuIt.next();
                    System.out.println("节点名" + stuInfo.getName() + "节点值：" + stuInfo.getStringValue());
                }
                System.out.println("该学生的信息读取完成");
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

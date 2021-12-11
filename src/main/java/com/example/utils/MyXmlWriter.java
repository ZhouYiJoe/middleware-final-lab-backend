package com.example.utils;

import com.example.config.XmlFileConfig;
import com.example.entity.Student;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import org.springframework.stereotype.Component;

/**
 * 对MyStudentInfo.xml的写入操作
 */
@Component
public class MyXmlWriter {
    private final XmlFileConfig xmlFileConfig;

    public MyXmlWriter(XmlFileConfig xmlFileConfig) {
        this.xmlFileConfig = xmlFileConfig;
    }

    /**
     * 往XML文件中添加一条学生信息
     * @param student 新的学生信息
     */
    public void addStudent(Student student) {
        try {
            //获取XML文件的根元素
            Document xmlDocument = xmlFileConfig.getXmlDocument();
            Element xmlRoot = xmlDocument.getRootElement();
            //新建一个新的XML元素
            //将student对象的属性写入到该元素中
            Element studentElement = xmlRoot.addElement("student");
            Element id = studentElement.addElement("id");
            id.setText(student.getId());
            Element name = studentElement.addElement("name");
            name.setText(student.getName());
            Element sex = studentElement.addElement("sex");
            sex.setText(student.getSex());
            Element major = studentElement.addElement("major");
            major.setText(student.getMajor());
            //将修改保存到XML文件中
            XMLWriter xmlWriter = xmlFileConfig.getXmlWriter();
            xmlWriter.write(xmlDocument);
            xmlWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

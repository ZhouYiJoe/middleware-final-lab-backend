package com.example.utils;

import com.example.config.XmlFileConfig;
import com.example.entity.Student;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import org.springframework.stereotype.Component;

@Component
public class MyXmlWriter {
    public void addStudent(Student student) {
        try {
            Document xmlDocument = XmlFileConfig.getXmlDocument();
            Element xmlRoot = xmlDocument.getRootElement();

            Element studentElement = xmlRoot.addElement("student");
            Element id = studentElement.addElement("id");
            id.setText(student.getId());
            Element name = studentElement.addElement("name");
            name.setText(student.getName());
            Element sex = studentElement.addElement("sex");
            sex.setText(student.getSex());
            Element major = studentElement.addElement("major");
            major.setText(student.getMajor());

            XMLWriter xmlWriter = XmlFileConfig.getXmlWriter();
            xmlWriter.write(xmlDocument);
            xmlWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

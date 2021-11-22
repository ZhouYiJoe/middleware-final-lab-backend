package com.example.utils;

import com.example.config.XmlFileConfig;
import com.example.entity.Student;
import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class MyXmlReader {
    private final XmlFileConfig xmlFileConfig;

    public MyXmlReader(XmlFileConfig xmlFileConfig) {
        this.xmlFileConfig = xmlFileConfig;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Document xmlDocument = xmlFileConfig.getXmlDocument();
        Element xmlRoot = xmlDocument.getRootElement();

        Iterator<Element> studentsIterator = xmlRoot.elementIterator();
        while (studentsIterator.hasNext()) {
            Element studentElement = studentsIterator.next();
            Student student = new Student();
            Iterator<Element> attrIterator = studentElement.elementIterator();
            while (attrIterator.hasNext()) {
                Element attr = attrIterator.next();
                setStudentAttr(student, attr.getName(), attr.getStringValue());
            }
            students.add(student);
        }

        return students;
    }

    private void setStudentAttr(Student student, String attrName, String attrValue) {
        switch (attrName) {
            case "id":
                student.setId(attrValue);
                break;
            case "name":
                student.setName(attrValue);
                break;
            case "sex":
                student.setSex(attrValue);
                break;
            case "major":
                student.setMajor(attrValue);
                break;
        }
    }
}

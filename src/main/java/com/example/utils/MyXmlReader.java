package com.example.utils;

import com.example.config.XmlFileConfig;
import com.example.entity.Student;
import org.dom4j.Document;
import org.dom4j.Element;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对MyStudentInfo.xml的读取操作
 */
@Component
public class MyXmlReader {
    private final XmlFileConfig xmlFileConfig;

    public MyXmlReader(XmlFileConfig xmlFileConfig) {
        this.xmlFileConfig = xmlFileConfig;
    }

    /**
     * 读取MyStudentInfo.xml中所有的学生信息
     * @return MyStudentInfo.xml中所有的学生信息
     */
    public List<Student> getAllStudents() {
        //students列表存放所有从XML文件读取到的学生信息，并作为返回值返回
        List<Student> students = new ArrayList<>();
        //获取XML文件根元素
        Document xmlDocument = xmlFileConfig.getXmlDocument();
        Element xmlRoot = xmlDocument.getRootElement();
        //遍历XML文件中所有的<student>标签
        //把XML文件中的内容都保存到students列表里
        Iterator<Element> studentsIterator = xmlRoot.elementIterator();
        while (studentsIterator.hasNext()) {
            Element studentElement = studentsIterator.next();
            //遍历<student>标签中的所有内容
            //并将其中的内容赋给Student对象的属性
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

    /**
     * 根据从XML标签中读取到的参数attrName（属性名称）将attrValue赋给student对象的对应属性
     * @param student 属性被赋值的Student对象
     * @param attrName 从XML标签中读取到的属性名称
     * @param attrValue 从XML文件中读取到的属性值
     */
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

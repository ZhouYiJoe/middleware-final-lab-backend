package com.example.config;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;

public class XmlFileConfig {
    public static final String XML_FILE_PATH = "E:\\middleware-final-lab-files\\MyStudentInfo.xml";

    public static Document getXmlDocument() {
        try {
            File xmlFile = new File(XML_FILE_PATH);
            SAXReader saxReader = new SAXReader();
            return saxReader.read(xmlFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static XMLWriter getXmlWriter() {
        try {
            return new XMLWriter(new FileWriter(XML_FILE_PATH), OutputFormat.createPrettyPrint());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

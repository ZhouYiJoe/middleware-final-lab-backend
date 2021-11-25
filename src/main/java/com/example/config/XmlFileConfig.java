package com.example.config;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.boot.SpringBootConfiguration;

import java.io.File;
import java.io.FileWriter;

@SpringBootConfiguration
public class XmlFileConfig {
    private final String xmlFilePath = "MyStudentInfo.xml";

    public Document getXmlDocument() {
        try {
            File xmlFile = new File(xmlFilePath);
            SAXReader saxReader = new SAXReader();
            return saxReader.read(xmlFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public XMLWriter getXmlWriter() {
        try {
            return new XMLWriter(new FileWriter(xmlFilePath), OutputFormat.createPrettyPrint());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

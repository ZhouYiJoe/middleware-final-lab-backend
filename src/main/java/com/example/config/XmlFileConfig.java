package com.example.config;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.boot.SpringBootConfiguration;

import java.io.File;
import java.io.FileWriter;

/**
 * 与XML文件读写相关的配置
 */
@SpringBootConfiguration
public class XmlFileConfig {
    //XML文件的路径
    private final String xmlFilePath = "MyStudentInfo.xml";

    /**
     * 新建一个MyStudentInfo.xml对应的Document对象以对XML文件进行读取
     * @return MyStudentInfo.xml对应的Document对象
     */
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

    /**
     * 新建一个MyStudentInfo.xml对应的XMLWriter对象以对XML文件进行写入
     * @return MyStudentInfo.xml对应的XMLWriter对象
     */
    public XMLWriter getXmlWriter() {
        try {
            return new XMLWriter(new FileWriter(xmlFilePath), OutputFormat.createPrettyPrint());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

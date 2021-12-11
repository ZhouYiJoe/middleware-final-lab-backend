package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.utils.MyXmlReader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 从XML文件内容到数据库中数据的转化操作
 */
@Service
public class XmlToDb {
    private final StudentRepository studentRepository;
    private final MyXmlReader myXmlReader;

    public XmlToDb(StudentRepository studentRepository, MyXmlReader myXmlReader) {
        this.studentRepository = studentRepository;
        this.myXmlReader = myXmlReader;
    }

    /**
     * 将MyStudentInfo.xml中的内容覆盖写入到数据库中
     */
    @Transactional
    public void xmlToDb() {
        //获取XML文件中所有的学生信息
        List<Student> students = myXmlReader.getAllStudents();
        //移除数据库中原有的所有学生信息
        studentRepository.removeAllStudents();
        //将XML文件中所有的学生信息写入到数据库中
        for (Student student : students) {
            studentRepository.addStudent(student);
        }
    }
}

package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.utils.MyXmlReader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class XmlToDb {
    private final StudentRepository studentRepository;
    private final MyXmlReader myXmlReader;

    public XmlToDb(StudentRepository studentRepository, MyXmlReader myXmlReader) {
        this.studentRepository = studentRepository;
        this.myXmlReader = myXmlReader;
    }

    @Transactional
    public void xmlToDb() {
        List<Student> students = myXmlReader.getAllStudents();
        studentRepository.removeAllStudents();
        for (Student student : students) {
            studentRepository.addStudent(student);
        }
    }
}

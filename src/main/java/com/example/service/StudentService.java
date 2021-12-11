package com.example.service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import com.example.utils.MyXmlWriter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 与学生信息有关的业务逻辑
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final MyXmlWriter myXmlWriter;

    public StudentService(StudentRepository studentRepository, MyXmlWriter myXmlWriter) {
        this.studentRepository = studentRepository;
        this.myXmlWriter = myXmlWriter;
    }

    /**
     * 获取数据库中所有的学生信息
     * @return 数据库中所有的学生信息
     */
    public List<Student> getAllStudents() {
        return studentRepository.findAllStudents();
    }

    /**
     * 往MyStudentInfo.xml中添加一条新的学生信息
     * @param student 新的学生信息
     */
    public void addStudent(Student student) {
        myXmlWriter.addStudent(student);
    }
}

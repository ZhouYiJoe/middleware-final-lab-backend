package com.example.repository;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentRepository {
    void addStudent(Student student);

    void removeAllStudents();

    List<Student> findAllStudents();
}

package com.example.repository;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 读写数据库中的学生信息
 */
@Mapper
public interface StudentRepository {
    /**
     * 向数据库中添加一条新的学生信息记录
     * @param student 新的学生信息
     */
    void addStudent(Student student);

    /**
     * 删除数据库中的所有学生信息
     */
    void removeAllStudents();

    /**
     * 读取数据库中所有的学生信息
     * @return 数据库中所有的学生信息
     */
    List<Student> findAllStudents();
}

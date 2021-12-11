package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.service.XmlToDb;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 处理前端发送过来的与学生信息有关的HTTP请求
 */
@RequestMapping("/students")
@Controller
public class StudentController {
    private final XmlToDb xmlToDb;
    private final StudentService studentService;

    public StudentController(XmlToDb xmlToDb,
                             StudentService studentService) {
        this.xmlToDb = xmlToDb;
        this.studentService = studentService;
    }

    /**
     * 处理要求将XML文件的内容转换为数据库中数据的HTTP请求
     * 并返回数据转换成功后的提示页面
     * @return 提示页面
     */
    @RequestMapping("/xml-to-db")
    public String xmlToDb() {
        xmlToDb.xmlToDb();
        return "xml-to-db-success";
    }

    /**
     * 处理要求添加新的学生信息的HTTP请求
     * 并返回添加成功后的提示页面
     * @param student 新的学生信息
     * @return 提示页面
     */
    @PostMapping
    public String addStudent(Student student) {
        studentService.addStudent(student);
        return "add-student-success";
    }

    /**
     * 将数据库中所有学生信息转化为JSON字符串显示在页面上
     * @param model 传递给JSP页面的数据，其中包含要在页面上显示的JSON字符串
     * @return 显示JSON字符串的页面
     */
    @GetMapping
    public String getAllStudents(Model model) {
        //获取数据库中的所有学生信息
        List<Student> students = studentService.getAllStudents();
        //将刚获取到的学生信息转化为JSON字符串
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
        String jsonString = null;
        try {
            jsonString = objectWriter.writeValueAsString(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //将JSON字符串传递给JSP页面
        model.addAttribute("jsonString", jsonString);
        return "show-all-students";
    }
}

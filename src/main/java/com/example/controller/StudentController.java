package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import com.example.service.XmlToDb;
import com.example.utils.MyXmlWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@RequestMapping("/students")
@Controller
public class StudentController {
    private final XmlToDb xmlToDb;
    private final MyXmlWriter myXmlWriter;
    private final StudentService studentService;

    public StudentController(XmlToDb xmlToDb,
                             MyXmlWriter myXmlWriter,
                             StudentService studentService) {
        this.xmlToDb = xmlToDb;
        this.myXmlWriter = myXmlWriter;
        this.studentService = studentService;
    }

    @RequestMapping("/xml-to-db")
    public String xmlToDb() {
        xmlToDb.xmlToDb();
        return "xml-to-db-success";
    }

    @PostMapping
    public String addStudent(Student student) {
        myXmlWriter.addStudent(student);
        return "add-student-success";
    }

    @GetMapping
    public String getAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
        String jsonString = null;
        try {
            jsonString = objectWriter.writeValueAsString(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("jsonString", jsonString);
        return "show-all-students";
    }
}

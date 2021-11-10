package com.example;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiddlewareFinalLabBackendApplicationTests {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {

    }

}

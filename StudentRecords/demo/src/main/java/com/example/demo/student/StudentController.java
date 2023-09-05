package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class consists of all
 * the resources for our api
 */
@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * getting something out from our server
     * @return a list
     */
    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
}

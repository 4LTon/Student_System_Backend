package com.student_system.controller;

import com.student_system.model.Student;
import com.student_system.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);

        log.info("New student is added");

        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        log.info("Getting all students from DB.");

        return studentService.getAllStudents();
    }
}

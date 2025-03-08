package com.nextlearning.platform.Controller;


import com.nextlearning.platform.Entity.Student;
import com.nextlearning.platform.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(Long id){
        studentService.deleteStudent(id);
    }
}

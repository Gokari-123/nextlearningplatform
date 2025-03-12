package com.nextlearning.platform.Controller;

import com.nextlearning.platform.Entity.Course;
import com.nextlearning.platform.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    CourseServices courseServices;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseServices.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(Long id){
        return courseServices.getCourseById(id);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return courseServices.saveCourse(course);
    }

    @DeleteMapping("{/id}")
    public void deleteCourse(@PathVariable Long id){
        courseServices.deleteCourse(id);
    }

}

package com.examplerestapi.restapi.controller;

import com.examplerestapi.restapi.model.Course;
import com.examplerestapi.restapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
       return  courseService.getAllCourses();
    }
}

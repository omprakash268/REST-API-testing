package com.examplerestapi.restapi.service;

import com.examplerestapi.restapi.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    public List<Course> courseList = new ArrayList<>();

    public CourseService(){
        courseList.add(new Course("12234","Java Spring Boot","Java Spring Boot Course"));
        courseList.add(new Course("45241","Angular","Angular Course"));
        courseList.add(new Course("32332","NodeJS","NodeJS Course"));
    }

    public List<Course> getAllCourses(){
        return courseList;
    }

    public Course getCourseById(String courseId){

        Course course = null;
        for(Course it:courseList){
            if(it.getCourseId().equals(courseId)){
                course = it;
                break;
            }
        }
        return course;
    }
}

package com.example.course.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.Dao.CourseDao;
import com.example.course.Entities.Courses;
import com.example.course.Services.CourseServiceImpl;

import java.util.*;

import javax.persistence.criteria.CriteriaBuilder.Case;
import java.util.*;
@RestController
public class MyController {
    
	@Autowired
	CourseServiceImpl courseService;
	
	
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}
	
	// to Get all courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
     return courseService.getCourses();
		
	}
	
	// to get Course by Its ID
	@GetMapping("/courses/{courseID}")
	public Courses getCoursesById(@PathVariable("courseID") long courseID){
     return courseService.getCoursesById(courseID);
		
	}
	
	
	// to add courses
	@PutMapping("/courses")
	public void saveCourse(@RequestBody Courses course )
	{
	 	courseService.saveOrUpdate(course);
	}
     
	
	//delete course
	@DeleteMapping("/courses/{courseID}")
	public void delete(@PathVariable("courseId") Courses  courseID) {
	  courseService.delete(courseID);
}
	

	
	
}
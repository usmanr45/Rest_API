package com.example.course.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.Dao.CourseDao;
import com.example.course.Entities.Courses;
@Service
public class CourseServiceImpl  {
    @Autowired
	 CourseDao course;
	
	public List<Courses> getCourses() {
		List<Courses> courses=new ArrayList<Courses>();
		course.findAll().forEach(course1->courses.add(course1));
		return courses;
	}

	public Courses getCoursesById(long id) {
		return course.findById(id).get();
	}

	public Courses saveOrUpdate(Courses courses) {
		 return course.save(courses);
	}

	public Courses delete(Courses courses) {
		 course.delete(courses);
		return courses;
		
		
		
	}


	
	
}

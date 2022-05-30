package com.example.course.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.Entities.Courses;
@Repository
public interface CourseDao extends JpaRepository<Courses, Long> {

	
	
}

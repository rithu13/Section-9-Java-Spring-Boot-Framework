package com.section2.sect2;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Coursecontroller {
	
	@RequestMapping("/course")
public List<Course> retrieveAllCourses(){
	return Arrays.asList(
			new Course(1,"Learn AWS","in 28 minutues")
			);
			
			
}
}

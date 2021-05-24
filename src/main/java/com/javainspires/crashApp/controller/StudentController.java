package com.javainspires.crashApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainspires.crashApp.service.StudentService;
import com.javainspires.crashApp.student.Student;

@RestController
public class StudentController
{
	
 
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public void addStudent(@RequestBody Student student) 
	{
		studentService.addStudent(student);
	}
	
	
	@RequestMapping("/students")
	public  List<Student> getAllStudent() 
	{
		return studentService.getAllStudent();
	}
	
	@RequestMapping("/student/{id}")
	public Student getStudent(@PathVariable String id) 
	{
		return studentService.getStudent(id);
		
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/student/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable String id ) 
	{
		studentService.updateStudent(id,student);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/student/{id}")
	public void deleteStudent(@PathVariable String id)
	{
		studentService.deleteStudent(id);
	}
	
}

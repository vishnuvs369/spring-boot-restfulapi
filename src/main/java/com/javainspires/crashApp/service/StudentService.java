package com.javainspires.crashApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainspires.crashApp.repository.StudentRepository;
import com.javainspires.crashApp.student.Student;

@Service
public class StudentService {
    @Autowired
	private StudentRepository studentRepository;
    
    
    public void addStudent(Student student)
	{
		studentRepository.save(student);
		
	}


	public List<Student> getAllStudent() 
	{
		List<Student>students=new ArrayList<Student>();
		studentRepository.findAll().forEach(students::add);
		return students;
		
	}


	public Student getStudent(String id) 
	{
		Student s=studentRepository.findById(id).get();
		return s;
		
	}


	public void updateStudent(String id,Student student)
	{
		studentRepository.save(student);
		
	}


	public void deleteStudent(String id) 
	{
		studentRepository.deleteById(id);
		
	}


	
}

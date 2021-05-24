package com.javainspires.crashApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.javainspires.crashApp.student.Student;



public interface StudentRepository extends JpaRepository<Student, String> {

}

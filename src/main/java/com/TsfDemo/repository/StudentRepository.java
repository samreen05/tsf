package com.TsfDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TsfDemo.Model.StudentModel;

@Repository

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
	
	

}

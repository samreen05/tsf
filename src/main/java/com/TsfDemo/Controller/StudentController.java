package com.TsfDemo.Controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TsfDemo.Model.StudentModel;
import com.TsfDemo.repository.StudentRepository;

@RestController
@RequestMapping("/")


public class StudentController {
	
	StudentModel studMod;
	
	@Autowired	
	StudentRepository studRepo;
	
	@GetMapping("tsfstudent")
	private List<StudentModel> getAll()
	{
		return studRepo.findAll();
	}

	@PostMapping("addtsfstudent")
	private StudentModel createStud(@Valid @RequestBody StudentModel studModel)
	{
		return studRepo.save(studModel);
	}
}

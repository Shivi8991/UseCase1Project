package com.prepare.DemoRest.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prepare.DemoRest.DTO.Student;

@RestController
@RequestMapping("/crud")
public class CRUDcontroller {
	@GetMapping("/student")
	public String student() {
		return "student";
	}

	@PostMapping("/create/student")
	public String createCrud(@RequestBody Student student) {
		return "Student created : " + student.getName() + " age " + student.getAge();
	}
}

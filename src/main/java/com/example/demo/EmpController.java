package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmpController {
	@PostMapping
	public Emp createEmp(@RequestBody Emp emp) {
		return emp;
	}
	
	@GetMapping
	public Emp getEmp() {
		return new Emp(100,"srinivas100",100);  
	}
}

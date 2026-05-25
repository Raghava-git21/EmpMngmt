package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmpEntity;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/emp")
@CrossOrigin("*")
public class EmpController {
	@Autowired
	
	private EmpService service;
	@PostMapping("/add")
	public EmpEntity addNewEmp(@RequestBody EmpEntity empEntity) {
		return service.addEmployee(empEntity);
		
	}
	@GetMapping("/allUsers")
	public List<EmpEntity> getallUsers() {
		return service.getAllUsers();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteBYId(@PathVariable long id) {
		service.deleteBYId(id);
	}
	@PutMapping("/update/{id}")
	public EmpEntity updateEmployee(@PathVariable long id,@RequestBody EmpEntity empEntity) {
		return service.updateEmployee(id, empEntity);
	}
	
}

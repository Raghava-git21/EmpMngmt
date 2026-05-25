package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmpEntity;
import com.example.demo.repo.Emprepo;


@Service

public class EmpService {
	
	@Autowired
	private Emprepo repo;
	
	public EmpEntity addEmployee(EmpEntity empEntity) {
		return repo.save(empEntity);
		
	}
	
	public List<EmpEntity> getAllUsers() {
		return repo.findAll();
	}
	
	public void deleteBYId(Long id) {
		repo.deleteById(id);
	}
	public EmpEntity updateEmployee(long id, EmpEntity empEntity) {
		EmpEntity emp = repo.findById(id).orElse(null);
		if(emp != null) {
			emp.setName(empEntity.getName());
			emp.setAddress(empEntity.getAddress());
			emp.setSalary(empEntity.getSalary());

			return repo.save(emp);
		}
		
		return null;
	}

}

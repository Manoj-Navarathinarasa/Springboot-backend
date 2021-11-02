package com.javaguides.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaguides.demo.model.Employe;
import com.javaguides.demo.repository.EmployeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeController {
	
	@Autowired
	private EmployeRepository employeRepository;
	
	//get all employee
	
	@GetMapping("/employe")
	public List <Employe> getAllEmployes(){
		return employeRepository.findAll();
	}
	
	
}

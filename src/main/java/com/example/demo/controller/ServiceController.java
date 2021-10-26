package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Test2Model;
import com.example.demo.repo.Tesy2Repo;

@RestController
public class ServiceController {
	
	@Autowired
	private Tesy2Repo repo;
	
	@GetMapping("/hello")
	public String returnString() {
		return "Hello, I'm service2";
	}
	
	@GetMapping("/dbTest")
	public List<Test2Model> returnTest1() {
		return repo.findAll();
	}

}

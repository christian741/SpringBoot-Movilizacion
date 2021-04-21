package com.gmail.christian741.Main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.christian741.Main.entity.User;
import com.gmail.christian741.Main.services.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserService service;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody User user){
		this.service.saveUser(user);
		return null;
	}
	
	@GetMapping("/getAlls")
	public ResponseEntity<?> getAlls(){
		
		return null;
	}
	
	@GetMapping("/getForId/{id}")
	public ResponseEntity<?> getForId(@PathVariable Integer id){
		
		return null;
	}
	
	@PutMapping ("/update/{id}")
	public ResponseEntity<?> update(@PathVariable Integer id,@RequestBody User user){
		
		return null;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		
		return null;
	}
}


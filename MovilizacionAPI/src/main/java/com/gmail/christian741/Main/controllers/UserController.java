package com.gmail.christian741.Main.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping("/save")
	public ResponseEntity<?> save(){
		
		return null;
	}
	
	@GetMapping("/getAlls")
	public ResponseEntity<?> getAlls(){
		
		return null;
	}
	
	@GetMapping("/getForId/{id}")
	public ResponseEntity<?> getForId(){
		
		return null;
	}
	
	@PutMapping ("/update")
	public ResponseEntity<?> update(){
		
		return null;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(){
		
		return null;
	}
}


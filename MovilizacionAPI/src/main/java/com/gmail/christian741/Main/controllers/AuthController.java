package com.gmail.christian741.Main.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@GetMapping("/signin")
	public ResponseEntity<?> signIn(@RequestParam(required = true) String nickname,
									@RequestParam(required = true) String password){
		return null;
	}
	
	@PostMapping("/signup")
	public ResponseEntity<?> signUp(){
		return null;
	}
	
	@GetMapping("/recoveryPassword")
	public ResponseEntity<?> recoveryPassword(){
		return null;
	}
	

}

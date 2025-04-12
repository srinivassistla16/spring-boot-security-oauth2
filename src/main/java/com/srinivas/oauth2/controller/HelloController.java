package com.srinivas.oauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth2")
public class HelloController {
	
	@GetMapping("/simple")
	public ResponseEntity<String> getSimple() {
		return ResponseEntity.ok("Hello, Simple");
	}

	@GetMapping("/complex")
	public ResponseEntity<String> getComplex() {
		return ResponseEntity.ok("Hello, Complex");
	}

}

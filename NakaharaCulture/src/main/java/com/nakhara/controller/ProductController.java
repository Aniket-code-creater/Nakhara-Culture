package com.nakhara.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nakhara")
public class ProductController {
	
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		return new ResponseEntity<>("Hello it's Work!",HttpStatus.ACCEPTED);
	}

}

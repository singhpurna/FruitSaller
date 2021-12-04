package com.purna.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestController1 {

	private List fruits=Arrays.asList("Mango","Banna","Gaphes");
	
	public ResponseEntity<?>showFruits(){
		return ResponseEntity.ok(fruits);
	}
}

package com.crypto.arbitrer;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ArbitrerApplication {

	public static void main(String[] args) {
		System.out.println("hola");
		
			
	
		SpringApplication.run(ArbitrerApplication.class, args);
		System.out.println("hola");
		
		
	}
	
	@GetMapping("/")
	public String home() {
		
		return "hello";
		
	}
	

}

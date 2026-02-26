package com.example.demo;

import com.example.demo.service.BavardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private BavardService bavardService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
		bavardService.parler();
		return "Bonjour, " + name + " !";
	}

	@GetMapping("/blabla")
	public String blabla() {
		return bavardService.parler();
	}
}

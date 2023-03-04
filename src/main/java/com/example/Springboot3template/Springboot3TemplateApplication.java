package com.example.Springboot3template;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// this is a wrapper for @Configuration,@EnableAutoConfiguration,@ComponentScan(Tells spring where to look for components )
@RestController
public class Springboot3TemplateApplication {
	@Value("${server.port}")
	private int serverPort;
	public static void main(String[] args) {
		SpringApplication.run(Springboot3TemplateApplication.class, args);
	}
	@GetMapping("/")
	public String Greet(){
		return "Hello, Application running on Port:" + serverPort;
	}

}

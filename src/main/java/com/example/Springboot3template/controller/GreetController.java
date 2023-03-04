package com.example.Springboot3template.controller;

import com.example.Springboot3template.payloads.responses.GreetResponse;
import com.example.Springboot3template.payloads.responses.Person;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// this wraps @Controller,@ResponseBody. This is under Spring MVC package
@RequestMapping("/api/greet")
// this can also be used as @RequestMapping(method=RequestMethod.GET,value="/api/greet")
public class GreetController {
    @GetMapping
    public GreetResponse Greet(HttpServletRequest request){
        return new GreetResponse("Hello", List.of("Java","Python"), new Person("Sam"));
    }


}

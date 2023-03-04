package com.example.Springboot3template.controller;

import com.example.Springboot3template.model.Customer;
import com.example.Springboot3template.payloads.responses.GreetResponse;
import com.example.Springboot3template.payloads.responses.NewCustomerRequest;
import com.example.Springboot3template.payloads.responses.Person;
import com.example.Springboot3template.repositories.CustomerRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// this wraps @Controller,@ResponseBody. This is under Spring MVC package
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping
    public List<Customer > getCustomers(HttpServletRequest request){
        return customerRepository.findAll();
    }
    @PostMapping
    public void addCustomers(@RequestBody NewCustomerRequest request){
        Customer customer = new Customer();
        customer.setAge(request.age());
        customer.setEmail(request.email());
        customer.setName(request.name());
        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id){
        customerRepository.deleteById(id);
    }

    @PutMapping("{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer id,@RequestBody NewCustomerRequest request){
        Customer customer = customerRepository.findById(id).orElseThrow();
        customer.setAge(request.age());
        customer.setEmail(request.email());
        customer.setName(request.name());
        customerRepository.save(customer);
    }




}

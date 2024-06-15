package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.IPersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/person")
public class PersonController {
    private final IPersonService iPersonService;

    PersonController(IPersonService iPersonService) {
       this.iPersonService = iPersonService;
    }
    @GetMapping("{id}")
    public Person get(@PathVariable("id") Long id) {
        return this.iPersonService.findById(id);
    }

    @GetMapping
    public List<Person> getAll (){
        return this.iPersonService.findAll();
    }
}

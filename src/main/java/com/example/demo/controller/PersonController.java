package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/person")
public class PersonController {
    private PersonRepository personRepository;

    PersonController(PersonRepository personRepository) {
       this.personRepository = personRepository;
    }
    @GetMapping("{id}")
    public Person get(@PathVariable("id") Long id) {
        return this.personRepository.findById(id).get();
    }

    @GetMapping
    public List<Person> getAll (){
        return this.personRepository.findAll();
    }
}

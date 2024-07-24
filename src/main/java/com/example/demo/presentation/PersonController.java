package com.example.demo.presentation;

import com.example.demo.application.PersonService;
import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/person")
public class PersonController {
    private final PersonService personService;

    PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("{id}")
    public Person get(@PathVariable("id") Long id) {
        return this.personService.findById(id);
    }

    @GetMapping
    public List<Person> getAll (){
        return this.personService.findAll();
    }
}

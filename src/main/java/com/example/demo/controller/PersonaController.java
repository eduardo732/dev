package com.example.demo.controller;

import com.example.demo.model.PersonaDev;
import com.example.demo.repository.PersonaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/persona")
public class PersonaController {
    private PersonaRepository personaRepository;

    PersonaController(PersonaRepository personaRepository) {
       this.personaRepository = personaRepository;
    }
    @GetMapping("{id}")
    public PersonaDev get(@PathVariable("id") Long id) {
        return this.personaRepository.findById(id).get();
    }

    @GetMapping
    public List<PersonaDev> getAll (){
        return this.personaRepository.findAll();
    }
}

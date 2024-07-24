package com.example.demo.application;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

import java.util.List;

public class PersonService {
    private final PersonRepository personRepository;

    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person findById(Long id) {
        return this.personRepository.findById(id).orElse(null);

    }

    public List<Person> findAll() {
        return this.personRepository.findAll();
    }
}

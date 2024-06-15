package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

import java.util.List;

public class PersonServiceImpl implements IPersonService{
    private final PersonRepository personRepository;

    PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person findById(Long id) {
        return this.personRepository.findById(id).orElse(null);

    }

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAll();
    }
}

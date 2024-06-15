package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.List;

public interface IPersonService {

    Person findById(Long id);

    List<Person> findAll();
}

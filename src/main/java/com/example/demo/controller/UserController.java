package com.example.demo.controller;

import com.example.demo.model.UserDev;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    private UserRepository userRepository;

    UserController(UserRepository userRepository) {
       this.userRepository = userRepository;
    }
    @GetMapping("{id}")
    public UserDev get(@PathVariable("id") Long id) {
        return this.userRepository.findById(id).get();
    }
}

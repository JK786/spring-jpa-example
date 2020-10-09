package com.springlearning.springjpaexample.controllers;

import com.springlearning.springjpaexample.dto.UserRequest;
import com.springlearning.springjpaexample.entities.User;
import com.springlearning.springjpaexample.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRespository userRepository;

    @PostMapping("/user.json")
    public User createUser(@RequestBody UserRequest requestBody) {

        User toBeCreatedUser = new User(requestBody.getFirstName(),requestBody.getLastName(),requestBody.getAge());
        userRepository.save(toBeCreatedUser);
        return toBeCreatedUser;
    }

    @GetMapping("/user.json")
    public String getSample() {
        return "HEHE";
    }
}

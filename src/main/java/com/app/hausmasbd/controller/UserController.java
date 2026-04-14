package com.app.hausmasbd.controller;

import com.app.hausmasbd.entity.User;
import com.app.hausmasbd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }
}

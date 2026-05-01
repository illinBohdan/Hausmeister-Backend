package com.app.hausmasbd.controller;

import com.app.hausmasbd.dto.UserDTO;
import com.app.hausmasbd.entity.User;
import com.app.hausmasbd.mapper.UserMapper;
import com.app.hausmasbd.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "https://illinbohdan.github.io")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/register")
    public ResponseEntity<User> saveUser(@Valid @RequestBody UserDTO userDto){

        User user = userMapper.toEntity(userDto);

        User savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}

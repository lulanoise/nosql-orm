package com.develhope.nosqlorm.controllers;
import com.develhope.nosqlorm.entities.User;
import com.develhope.nosqlorm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser (@RequestBody @Valid User user){
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getUser(){
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable  String id){
        return userRepository.findById(id);
    }


}
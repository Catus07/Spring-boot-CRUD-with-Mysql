package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.User;
import com.example.DataBaseMysql.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userrepository;

    //add a new user
    @PostMapping("/Add")
    public User addUser(@RequestBody User user){
        return userrepository.save(user);
    }
    //Get all User
    @GetMapping
    public List<User> getALLUser(){
        return userrepository.findAll();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userrepository.findById(id).orElse(null);
    }


}

package com.webbackend.Backend.controller;


import com.webbackend.Backend.model.User;
import com.webbackend.Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    private UserService service;

    @PostMapping
    public User createUser(@RequestBody User user){

        return service.addData(user);

    }


    @GetMapping
    public List<User> getUser(){
        return service.findAllUsers();
    }

    @GetMapping("/{userId}")
    public User getTask(@PathVariable String userId){

        return service.getUserByUserID(userId);
    }


    @PutMapping
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);

    }

    @DeleteMapping("/{userId}")
    public String deleteTask(@PathVariable String userId){
        return service.deleteUser(userId);
    }




}

package com.miniProject01.miniproject.controller;

import com.miniProject01.miniproject.model.Login;
import com.miniProject01.miniproject.model.User;
import com.miniProject01.miniproject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "You are registered...";
    }

    @PostMapping("/login")
    public User checkLogin(@RequestBody Login login){
        User u = userRepo.findByEmailAndPassword(login.getEmail(),login.getPassword());
        User x = null;
        if (u==null){
            return x ;
        }
        return u;
    }

 }

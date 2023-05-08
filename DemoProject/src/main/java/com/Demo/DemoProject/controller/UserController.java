package com.Demo.DemoProject.controller;

import com.Demo.DemoProject.model.User;
import com.Demo.DemoProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
}

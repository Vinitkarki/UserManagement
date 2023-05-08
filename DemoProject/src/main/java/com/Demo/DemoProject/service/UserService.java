package com.Demo.DemoProject.service;

import com.Demo.DemoProject.model.User;
import com.Demo.DemoProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }


    public void deleteUser(int id){
        userRepository.deleteById(id);
    }
}

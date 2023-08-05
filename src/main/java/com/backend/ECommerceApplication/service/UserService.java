package com.backend.ECommerceApplication.service;

import com.backend.ECommerceApplication.entity.User;
import com.backend.ECommerceApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser()
    {
        List<User> userList=userRepository.findAll();
        return userList;
    }

}

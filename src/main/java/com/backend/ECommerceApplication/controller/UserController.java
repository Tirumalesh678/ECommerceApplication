package com.backend.ECommerceApplication.controller;

import com.backend.ECommerceApplication.entity.User;
import com.backend.ECommerceApplication.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public String showAllUser()
    {
        return "hello all users";
    }
}

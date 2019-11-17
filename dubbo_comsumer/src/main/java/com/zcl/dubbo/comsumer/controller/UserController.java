package com.zcl.dubbo.comsumer.controller;

import com.zcl.dubbo.comsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getName")
    public String getName() {
        return "test:" + userService.getUserName();
    }
}

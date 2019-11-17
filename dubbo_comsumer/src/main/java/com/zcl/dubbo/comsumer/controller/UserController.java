package com.zcl.dubbo.comsumer.controller;

import com.zcl.dubbo.comsumer.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理接口")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "获取用户名称")
    @GetMapping("/getName")
    public String getName() {
        String name = userService.getUserName();
        return name;
    }
}

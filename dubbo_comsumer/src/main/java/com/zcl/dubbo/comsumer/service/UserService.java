package com.zcl.dubbo.comsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zcl.dubbo.service.UserInfoService;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Reference(interfaceClass=UserInfoService.class)
    private UserInfoService userInfoService;

    public String getUserName(){
        return userInfoService.getName(1);
    }
}

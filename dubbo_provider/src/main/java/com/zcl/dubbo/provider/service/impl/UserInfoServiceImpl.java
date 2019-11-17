package com.zcl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zcl.dubbo.service.UserInfoService;

@Service(interfaceClass=UserInfoService.class)
@org.springframework.stereotype.Service
public class UserInfoServiceImpl implements UserInfoService {
    public String getName(Integer userId) {
        return "test name";
    }
}

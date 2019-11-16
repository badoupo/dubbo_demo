package com.zcl.dubbo.comsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@EnableDubboConfiguration
@SpringBootApplication
public class DubboComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboComsumerApplication.class, args);
    }
}

package com.user;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: drainli
 * @Description: 用户服务启动类
 * @Date: 2021/5/3 17:28
 **/
@SpringBootApplication
@EnableDubboConfiguration
public class IUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IUserServiceApplication.class,args) ;
    }

}

package com.order;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: drainli
 * @Description: order服务启动类
 * @Date: 2021/5/3 16:24
 **/
@SpringBootApplication
@EnableDubboConfiguration
public class IOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IOrderServiceApplication.class,args) ;
    }

}

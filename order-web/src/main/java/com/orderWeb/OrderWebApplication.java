package com.orderWeb;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: drainli
 * @Description:
 * @Date: 2021/5/3 21:27
 **/
@SpringBootApplication
@Slf4j
@EnableDubboConfiguration
public class OrderWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderWebApplication.class,args) ;
    }

}

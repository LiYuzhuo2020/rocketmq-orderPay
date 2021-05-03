package com.goods;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: drainli
 * @Description: 商品服务启动类
 * @Date: 2021/5/3 18:01
 **/
@SpringBootApplication
@EnableDubboConfiguration
public class IGoodsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(IGoodsServiceApplication.class,args) ;
    }
}

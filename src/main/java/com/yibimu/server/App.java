package com.yibimu.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *SpringBoot 启动入口
 * Created by admin on 2017/6/16.
 */
@ComponentScan(basePackages ={"com.yibimu.controller", "com.yibimu.service"} )
@MapperScan(basePackages = {"com.yibimu.dao"})
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

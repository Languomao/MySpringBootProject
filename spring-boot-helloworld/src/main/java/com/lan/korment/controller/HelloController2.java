package com.lan.korment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController2
 * @Description TODO
 * @Date 2019/11/30 11:00
 * @Created by Administrator
 */
@RestController
public class HelloController2 {
    @Value("${person.last-name}")
    private String name;
    @RequestMapping("/hello2")
    public String sayHello(){
        return "Hello"+","+ name;
    }
}


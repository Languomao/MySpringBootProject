package com.lan.korment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Classname HelloController
 * Description TODO
 * Date 2019/11/29 16:48
 * Created by LanKorment
 * */

//@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello2")
    public String hello(){
        return "hello world";
    }
}

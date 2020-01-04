package com.example.hello.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @RequestMapping("/hello")
    public String sayhi(){
        return "Hello this is URL";
    }
}
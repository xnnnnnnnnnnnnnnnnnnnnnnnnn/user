package com.example.test1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
@RequestMapping("/helloworld")
    public String a1(){
    return "hello world !";
}
}

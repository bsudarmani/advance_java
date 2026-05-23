package com.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringdemoController
{
    @GetMapping("/")
    public String hello()
    {
        return "hello world";
    }
}

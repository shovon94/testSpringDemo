package com.example.demo.helloTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class HelloController {
    @RequestMapping("/h")
    public String sayHi()
    {
        return "HI Test";
    }
}

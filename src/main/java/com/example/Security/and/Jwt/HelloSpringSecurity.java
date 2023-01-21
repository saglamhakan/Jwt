package com.example.Security.and.Jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringSecurity {

    @GetMapping("/hellospringsecurity")
    public String helloSpringSecurity(){
        return "hellospringsecurity";
    }
}

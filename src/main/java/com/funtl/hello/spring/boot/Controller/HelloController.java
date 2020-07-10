package com.funtl.hello.spring.boot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String sayHi() {
        return "Hello Spring Boot.";
    }
}

package com.study.spring.security.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestTwoController {

    @GetMapping("/test-two")
    public String test() {
        return "Test 2!";
    }
}

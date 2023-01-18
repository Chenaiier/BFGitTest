package com.example.gittest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cont {

    @GetMapping
    public String testing() {
        return "test successful";
    }
}

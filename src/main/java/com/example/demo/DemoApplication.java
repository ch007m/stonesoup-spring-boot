package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        return String.format("Welcome to the %s bar !",bar);
    }

    @Value("${bar:jungle}")
    private String bar;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
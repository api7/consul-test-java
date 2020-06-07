package com.example.demo.controller;

import com.example.demo.entity.Result;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/health")
    public Result Health() {
        return Result.success("java consul test health");
    }

}


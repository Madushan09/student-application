package com.example.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @GetMapping("/api/version")
    public String version() {
        return "<h1> Hello World!! </h1>";
    }
}
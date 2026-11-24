package com.example.studentapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @GetMapping("/api/version")
    public String version() {
        return "I Am the kingssh -i "C:\Users\WMChanaka\Desktop\New folder (2)\lab-key.pem" ec2-user@16.179.117.43";
    }
}
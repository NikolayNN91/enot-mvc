package com.web.enotmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class EnotController {

    @GetMapping("/home")
    public String getHomePage() {
        return "homePage";
    }

    @GetMapping("/")
    public String getBasePage() {
        return "homePage";
    }

    @PostMapping("/enot")
    public String getEnotPage(MultipartFile file) {

        return "homePage";
    }
}

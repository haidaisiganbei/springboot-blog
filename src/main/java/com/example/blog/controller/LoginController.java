package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("name","海带丝干杯");
        return "login";
    }
}

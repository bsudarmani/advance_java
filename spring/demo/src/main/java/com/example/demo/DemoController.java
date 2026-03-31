package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    // Load index page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Handle form submission
    @PostMapping("/submit")
    public String submit(@RequestParam("name") String name, Model model) {
        model.addAttribute("username", name);
        return "result";
    }
}
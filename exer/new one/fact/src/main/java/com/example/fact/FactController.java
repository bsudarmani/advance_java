package com.example.fact;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FactController
{
    @GetMapping
    public String home()
    {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculatefactorial(@RequestParam("number") int num,Model model)
    {
        long fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        model.addAttribute("num",num);
        model.addAttribute("fact",fact);
        return "result";
    }
}
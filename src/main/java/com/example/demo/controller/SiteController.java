package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {

    @GetMapping("/site")
    public String blogmain(Model model) {
        model.addAttribute("title","Spring сайт");
        return "site-main";
    }
}

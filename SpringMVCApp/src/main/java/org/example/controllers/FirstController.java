package org.example.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
//    HttpServletRequest request ne annotation @RequestParam("name")
    public String helloPage(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surename", required = false) String surename,
                            Model model) {
//        System.out.println("Hello " + name + " " + surename);
        model.addAttribute("message", "Hello " + name + " " + surename);
        String s = "first/hello";
        return s;
    }
    @GetMapping("/goodbye")
    public String goodbye() {
        return "first/goodbye";
    }

}

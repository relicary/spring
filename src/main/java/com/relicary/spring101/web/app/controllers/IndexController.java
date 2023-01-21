package com.relicary.spring101.web.app.controllers;

import com.relicary.spring101.web.app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"", "/index", "/", "/home"})
    public String index(Model model){

        model.addAttribute("title", "Hi Spring Framework with Model!");

        return "index";
    }

    @GetMapping("/profile")
    public String getProfile(Model model) {
        User user = new User();
        user.setFirstName("Ana");
        user.setLastName("Almeida");

        model.addAttribute("user", user);
        model.addAttribute("title", "User profile: ".concat(user.getFirstName()));

        return "profile";
    }
}

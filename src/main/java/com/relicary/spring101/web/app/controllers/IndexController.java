package com.relicary.spring101.web.app.controllers;

import com.relicary.spring101.web.app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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
        user.setEmail("ana.almeida@relicary.com");

        model.addAttribute("user", user);
        model.addAttribute("title", "User profile: ".concat(user.getFirstName()));

        return "profile";
    }

    @GetMapping("/list")
    public String getListProfiles(Model model) {

        List<User> users = new ArrayList<>();

        model.addAttribute("title", "User List");
        model.addAttribute("users", users);

        return "list";
    }
}

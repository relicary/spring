package com.relicary.spring101.web.app.controllers;

import com.relicary.spring101.web.app.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
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

        User user = User.builder()
                .firstName("Ana")
                .lastName("Almeida")
                .email("ana.almeida@relicary.com")
                .build();

        model.addAttribute("user", user);
        model.addAttribute("title", "User profile: ".concat(user.getFirstName()));

        return "profile";
    }

    @GetMapping("/list")
    public String getListProfiles(Model model) {

        List<User> users = Arrays.asList(
                User.builder()
                        .firstName("Ana").lastName("Almeida").email("ana.almeida@relicary.com")
                        .build(),
                User.builder()
                        .firstName("Benito").lastName("Blanco").email("benito.blanco@relicary.com")
                        .build(),
                User.builder()
                        .firstName("Celia").lastName("Crespo").email("celia.crespo@relicary.com")
                        .build(),
                User.builder()
                        .firstName("David").lastName("Duato").email("david.duato@relicary.com")
                        .build()
        );

        model.addAttribute("title", "User List");
        model.addAttribute("users", users);

        return "list";
    }
}

package com.relicary.spring101.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model){

        model.addAttribute("title", "Hi Spring Framework with Model!");

        return "index";
    }
}

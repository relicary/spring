package com.relicary.spring101.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/index", "/", "/home"})
    public String index(ModelMap model){

        model.addAttribute("title", "Hi Spring Framework!");

        return "index";
    }
}

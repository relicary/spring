package com.relicary.spring101.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping({"/index", "/", "/home"})
    public ModelAndView index(ModelAndView mv){

        mv.addObject("title", "Hi Spring Framework with ModelAndView!");
        mv.setViewName("index");
        return mv;
    }
}

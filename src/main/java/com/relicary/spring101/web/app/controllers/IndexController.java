package com.relicary.spring101.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class IndexController {

    @GetMapping({"/index", "/", "/home"})
    public String index(Map<String, Object> map){

        map.put("title", "Hi Spring Framework with Map!");

        return "index";
    }
}

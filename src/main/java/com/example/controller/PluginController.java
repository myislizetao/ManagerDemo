package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PluginController {

	
	@RequestMapping("index_home")
    public String get(){
		System.out.println("----------jsidjsjd");
        return "index_home";
    }
}

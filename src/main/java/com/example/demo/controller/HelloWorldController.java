package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloWorldController {
	@GetMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("hello", "Hello World!");
		return "index";
	}
}

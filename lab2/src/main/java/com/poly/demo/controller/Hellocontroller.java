package com.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellocontroller {
	@RequestMapping("/hello.th")
	public String hello(Model model) {
		model.addAttribute("a","<p>hello cả nhà</p>");
		return "hello";
	}
}

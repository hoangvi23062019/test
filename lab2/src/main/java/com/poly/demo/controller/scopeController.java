package com.poly.demo.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class scopeController {
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpSession session;
	@Autowired
	ServletContext context;
	@RequestMapping("/scope")
	public String index(Model modle) {
		modle.addAttribute("a", "i am request");
		request.setAttribute("b", "i am request");
		session.setAttribute("c", "i am session");
		context.setAttribute("d", "i am in Application Scope");
		return "scope/index";
	}
}

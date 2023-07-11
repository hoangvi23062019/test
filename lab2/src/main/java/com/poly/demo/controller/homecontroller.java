package com.poly.demo.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.demo.bean.student;

@Controller
public class homecontroller {
	@RequestMapping("/home/controller")
	public String home (Model model) throws StreamReadException, DatabindException, IOException {
		model.addAttribute("mess", "hello");
		ObjectMapper mapper = new ObjectMapper();
		String path = "D:\\TÀI LIEU HOC\\TÀI LIEU HOC\\java 6\\lab2\\src\\main\\resources\\static\\student.json";
		student st = mapper.readValue(new File(path), student.class);
		model.addAttribute("sv", st);
		return "home/index";
	}
}

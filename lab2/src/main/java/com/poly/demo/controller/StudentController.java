package com.poly.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.demo.bean.students;

@Controller
public class StudentController {
	@RequestMapping("/student")
	public String student(Model model, @RequestParam("index") Optional<Integer> index) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		File path = ResourceUtils.getFile("classpath:com/poly/demo/bean/students.json");
		TypeReference<List<students>> typeref = new TypeReference<List<students>>() {};
		List<students> st = mapper.readValue(path, typeref);
		int i = index.orElse(0);
		model.addAttribute("n", i);
		model.addAttribute("sv", st.get(i));
		return "scope/student";
	}
}

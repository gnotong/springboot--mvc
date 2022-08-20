package com.notgabs.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/show")
	public String showForm() {
		
		return "hello-form";
	}

	@RequestMapping("/process")
	public String processForm(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("name");
		
		model.addAttribute("name", studentName.toUpperCase());
		
		return "result";
	}
}

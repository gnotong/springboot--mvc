package com.notgabs.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/show")
	public String showForm() {
		return "hello-form";
	}

	@RequestMapping("/process")
	public String processForm() {
		return "result";
	}
}

package com.notgabs.http;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notgabs.entity.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("showForm")
	public String showForm(Model model) {
		
		model.addAttribute(new Customer());
		
		return "customer-form";
	}

	@PostMapping("processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult br) {
		if(br.hasErrors()) {
			return "customer-form";
		}

		return "customer-confirm";
	}
}

package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.util.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendEmail")
	public String sendSimpleEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
	}
	
	@PostMapping("/SendEmailBody")
	public String sendingEmail(@RequestParam("to") String to, @RequestParam("subject") String subject, @RequestParam("emailBody") String emailBody) {
		emailService.sendSimpleMail(to, subject, emailBody);
		return "create_costmer";
	}
}

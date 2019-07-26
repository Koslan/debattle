package com.example.debating.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.debating.repositories.MessageRepository;

@Controller
public class MessageController {

	@Autowired
	private MessageRepository repoM;

	@GetMapping("/message")
	public String getMessage(Model model) {
		model.addAttribute("message", repoM.findAll());
		return "message";
	}
	
}

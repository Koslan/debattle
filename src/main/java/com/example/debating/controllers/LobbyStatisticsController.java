package com.example.debating.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.debating.repositories.LobbyStatisticsRepository;

@Controller
public class LobbyStatisticsController {

	@Autowired
	private LobbyStatisticsRepository repoLS;

	@GetMapping("/lobbyStatistics")
	public String getConfigurations(Model model) {
		model.addAttribute("lobbyStatistics", repoLS.findAll());
		return "lobbyStatistics";
	}
}

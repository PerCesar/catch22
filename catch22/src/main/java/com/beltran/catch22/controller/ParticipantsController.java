package com.beltran.catch22.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.beltran.catch22.service.ParticipantsService;

@Controller
public class ParticipantsController {

	@Autowired
	private ParticipantsService participantsService;
	//display list of participants
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listParticipants", participantsService.getAllParticipants());
		return "index";
}
}
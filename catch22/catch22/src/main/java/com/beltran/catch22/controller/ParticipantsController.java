package com.beltran.catch22.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.beltran.catch22.entity.Participants;
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
	@GetMapping("/signUpParticipantsForm")
	public String signUpParticipantsForm(Model model) {
		Participants participant = new Participants();
		model.addAttribute("participant", participant);
		return "new_participant";
	}
	
	@PostMapping("/saveParticipant")
	public String saveParticipant(@ModelAttribute("participant") Participants participant) {
		//save new participant to database
		participantsService.saveParticipants(participant);
		return "redirect:/";
}
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value="id") long id, Model model) {
		
		//Get participant from the service package
		Participants participant = participantsService.getParticipantsById(id);
	
		//Set employee as a model attribute to pre-populate the table
		model.addAttribute("participant", participant);
		return "update_participant";
	}
}
	














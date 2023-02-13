package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/happiness")
public class BeachComponent {
	
	public BeachComponent() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	@PostMapping
	public String onBeach(BeachDTO dto1, Model model) {
		System.out.println("running Beach " + dto1);
		model.addAttribute("beach_Name" + dto1.getBeach_name());
		model.addAttribute("Location", dto1.getLocation());
		model.addAttribute("Games", dto1.getGames());
		return "beachsuccess.jsp";
	}
}
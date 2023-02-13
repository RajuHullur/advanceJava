package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/drinksParty")
public class CasinoComponent {
	
	public CasinoComponent() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}
	@PostMapping
	public String onCasino(CasinoDTO dto, Model model) {
		System.out.println("running Casino " + dto);
		model.addAttribute("Name", dto.getName());
		model.addAttribute("Cruise", dto.getCruise());
		model.addAttribute("Price", dto.getEntryfee());
		return "casinosSuccess.jsp";
	}
}
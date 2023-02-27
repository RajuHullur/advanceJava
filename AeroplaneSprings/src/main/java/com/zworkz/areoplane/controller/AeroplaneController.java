package com.zworkz.areoplane.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zworkz.areoplane.dto.AeroplaneDTO;
import com.zworkz.areoplane.entityDTO.AeroplaneEntityDTO;
import com.zworkz.areoplane.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService aeroplaneService;

	public AeroplaneController() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@GetMapping("/aeroplane")
	public String onAeroplane(Model model) {
		System.out.println("Running onAeroplane get method ");
		return "aeroplane";
	}

	@PostMapping("/aeroplane")
	public String onAeroplane(Model model, AeroplaneDTO dto) {
		System.out.println("Running onAeroplane post method:" + dto);
		Set<ConstraintViolation<AeroplaneDTO>> violations = this.aeroplaneService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations is controller to succsess");
		
		}
		return "aeroplaneSuccess";
	}
	

	@GetMapping("/Search")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get Search");
		AeroplaneEntityDTO aDto = this.aeroplaneService.findById(id);
		if (aDto != null) {
			model.addAttribute("dto", aDto);

		} else {
			model.addAttribute("message", "do not found");
		}
		return "Search";
	}
}

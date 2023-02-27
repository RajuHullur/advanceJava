package com.xworkz.waterperifier.Controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.waterperifier.Service.WaterpurifierService;
import com.xworkz.waterperifier.WaterpurifierDTO.WaterpurifierDTO;


@Controller
@RequestMapping("/")
public class WaterpurifierController {
	
	@Autowired
	private WaterpurifierService waterpurifierService;
	
	
	public WaterpurifierController() {
		System.out.println("Created :"+this.getClass().getSimpleName());

	}
	
	@GetMapping("/water")
	public String onFilter(Model model) {
		System.out.println("Running on onFilter get method");
		return "waterpurifier";
	}
	
	@PostMapping("/water")
	public String onFilter(WaterpurifierDTO dto,Model model) {
		System.out.println("Running on filter"+dto);
		
		Set<ConstraintViolation<WaterpurifierDTO>> violation=this.waterpurifierService.validateAndSave(dto);
		if(violation.isEmpty()) {
			System.out.println("no violation  and go to success");
			return "waterpurifierSuccess";
		}else {
		
		model.addAttribute("errors", violation);
		model.addAttribute("dto", dto);
		System.out.println("violation in container");
		return "waterpurifier";
	}
}
	@GetMapping("/searchbyId")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get search ");
		WaterpurifierDTO wDto=this.waterpurifierService.findById(id);
		if(wDto!=null) {
			model.addAttribute("dto",wDto);
		}else {
			model.addAttribute("message", "do  not found");
		}
		return "search";
	}
	}
	
	



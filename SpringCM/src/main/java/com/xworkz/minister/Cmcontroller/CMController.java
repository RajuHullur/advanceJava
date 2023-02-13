package com.xworkz.minister.Cmcontroller;


import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.minister.cmdto.CMDTO;
import com.xworkz.minister.service.CMService;


@Controller
@RequestMapping("/cm")
public class CMController {
	

	@Autowired
	private CMService cmService;

	public CMController() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@PostMapping
	public String onCm(CMDTO cmdto, Model model) {
		System.out.println("Running onCm in controller" + cmdto);
		Set<ConstraintViolation<CMDTO>> constraintViolations = this.cmService.validateAndSave(cmdto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("validation failed display error messages");
			constraintViolations.forEach((cv) -> System.err.println(cv.getMessage()));

		} else {
			System.out.println("validation success display success messages");
		}
		return "CM";
	}
}
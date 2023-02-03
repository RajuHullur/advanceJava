package com.xworkz.Server.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Server.dto.InterviewDTO;

@Component
@RequestMapping("/attend")
public class InterviewComponent {

	public InterviewComponent() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
		
	}

	@PostMapping
	public String onAttend(InterviewDTO dto) {
		System.out.println("Entered details " + dto);
		return "interview.jsp";
	}

}
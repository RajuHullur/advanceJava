package com.xworkz.Server.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/food")
public class FoodItemComponent {

	public FoodItemComponent() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String sending(@RequestParam String foodname, @RequestParam String type, @RequestParam int quantity,
			@RequestParam double price) {
		System.out.println("Running sending");
		System.out.println("Food name:" + foodname);
		System.out.println("Food type:" + type);
		System.out.println("Food quantity:" + quantity);
		System.out.println("Food price:" + price);
		return "FoodItem.jsp";
	}
}

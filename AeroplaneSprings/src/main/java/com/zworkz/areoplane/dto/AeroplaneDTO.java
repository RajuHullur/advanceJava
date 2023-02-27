package com.zworkz.areoplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AeroplaneDTO {
	@NotBlank(message=" company name caanot be null")
	@Size(min=3,max=20, message="Name connot be more than 3 or less than 20 charecter")
	private String company;
	
	@NotBlank(message="Name cannot be null")
	@Size(min=3,max=20, message="Name connot be more than 3 or less than 20 charecter")
	private String name;
	
	@NotBlank(message="cost cannot be null")
	@Size(min=3,max=20, message="")
	private int cost;
	
	@NotBlank(message="type cannot be null")
	private String type;
	
	
	@NotBlank(message="country cannot be null")
	@Size(min=3,max=20,message="Name connot be more than 3 or less than 20 charecter")
	private String country;

}

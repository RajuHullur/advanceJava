package com.xworkz.waterperifier.WaterpurifierDTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class WaterpurifierDTO {
	@NotBlank(message="name cannot be null")
	@Size(min=3,max=20,message="Name connot be more than 3 or less than 20 charecter")
	private String name;
	
	@NotBlank(message="brand cannot be null")
	@Size(min=3,max=20,message="Name connot be more than 3 or less than 20 charecter")
	private String brand;
	
	@NotBlank(message="color cannot be null")
	@Size(min=3,max=20,message="color connot be more than 3 or less than 20 charecter")
	private String color;
	
	@NotBlank(message="material cannot be null")
	@Size(min=3,max=20,message="material connot be more than 3 or less than 20 charecter")
	private String material;
	
	@NotBlank(message="capacity cannot be null")
	@Size(min=3,max=20,message="capacity connot be more than 3 or less than 20 charecter")
	private String capacity;

}

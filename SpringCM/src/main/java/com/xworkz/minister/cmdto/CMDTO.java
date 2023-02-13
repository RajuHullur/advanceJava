package com.xworkz.minister.cmdto;



import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




import lombok.Data;

@Data
public class CMDTO {
	@NotNull(message = "cm name cannot be null or blank")
	@Size(min=3,max=20,message = "cm name should be more than 3 and less than 20")
	private String name;
	@NotBlank(message = "party cannot be null")
	private String party;
	@NotBlank(message = "state cannot be null")
	private String state;
	@NotNull(message = "tenure cannot be null")
	@Min(value = 1,message = "tenure cannot be less than zero")
	private Integer tenure;
	@NotBlank
	private String portFolio;
}

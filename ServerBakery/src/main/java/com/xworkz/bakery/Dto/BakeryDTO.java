package com.xworkz.bakery.Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Bakery_table")
@Data 
public class BakeryDTO {

	
	@Column(name="/id")
	@Id
	private String bakary_Name;
	@Column(name="/owner_Name")
	private String owner_Name;
	@Column(name="/owner_Wife_Name")
	private String owner_Wife_Name;
	@Column(name="/owner_Married")
	private boolean owner_Married;
	@Column(name="/famous_For")
	private String famous_For;
	@Column(name="/bakary_Since")
	private String bakary_Since;
}




package com.xworkz.waterperifier.EntityDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter

@Table(name = "waterpurifier_table")
@NoArgsConstructor
public class WaterpurifierEntityDTO {
	@Id
	@Column(name = "w_id")
	private int id;

	@Column(name = "w_name")
	private String name;
	@Column(name = "w_brand")
	private String brand;
	@Column(name = "w_color")
	private String color;
	@Column(name = "w_material")
	private String material;
	@Column(name = "w_capacity")
	private String capacity;
}

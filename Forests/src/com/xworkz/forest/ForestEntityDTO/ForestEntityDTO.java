package com.xworkz.forest.ForestEntityDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="forests_table")
@NamedQuery(name="findByName",query="select dp from ForestEntityDTO dp where  dp.name='Amazon'")
public class ForestEntityDTO {
	
	@Id
	@Column(name="idforests_id")
	private int id ;
	
	@Column(name="forests_name")
	private String name;
	
	@Column(name="forests_state")
	private String state;
	
	@Column(name="forests_area")
	private String area;
	
	@Column(name="forests_type")
	private String type;
	
}

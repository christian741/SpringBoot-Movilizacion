package com.gmail.christian741.Main.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "travel")
public class Travel {
	

	private Integer id;
	private double initial_latitud;
	private double initial_longitud;
	private double suggested_latitud;
	private double suggested_longitud;
	private double final_latitud;
	private double final_longitud;
	private LocalDate date_init;
	private LocalDate date_final;
	private float distance;
	private String address_initial;
	private String address_final;
	private String address_suggested;
	
	
	

}

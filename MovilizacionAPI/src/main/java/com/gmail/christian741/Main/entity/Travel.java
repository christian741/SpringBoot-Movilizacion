package com.gmail.christian741.Main.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getInitial_latitud() {
		return initial_latitud;
	}
	public void setInitial_latitud(double initial_latitud) {
		this.initial_latitud = initial_latitud;
	}
	public double getInitial_longitud() {
		return initial_longitud;
	}
	public void setInitial_longitud(double initial_longitud) {
		this.initial_longitud = initial_longitud;
	}
	public double getSuggested_latitud() {
		return suggested_latitud;
	}
	public void setSuggested_latitud(double suggested_latitud) {
		this.suggested_latitud = suggested_latitud;
	}
	public double getSuggested_longitud() {
		return suggested_longitud;
	}
	public void setSuggested_longitud(double suggested_longitud) {
		this.suggested_longitud = suggested_longitud;
	}
	public double getFinal_latitud() {
		return final_latitud;
	}
	public void setFinal_latitud(double final_latitud) {
		this.final_latitud = final_latitud;
	}
	public double getFinal_longitud() {
		return final_longitud;
	}
	public void setFinal_longitud(double final_longitud) {
		this.final_longitud = final_longitud;
	}
	public LocalDate getDate_init() {
		return date_init;
	}
	public void setDate_init(LocalDate date_init) {
		this.date_init = date_init;
	}
	public LocalDate getDate_final() {
		return date_final;
	}
	public void setDate_final(LocalDate date_final) {
		this.date_final = date_final;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public String getAddress_initial() {
		return address_initial;
	}
	public void setAddress_initial(String address_initial) {
		this.address_initial = address_initial;
	}
	public String getAddress_final() {
		return address_final;
	}
	public void setAddress_final(String address_final) {
		this.address_final = address_final;
	}
	public String getAddress_suggested() {
		return address_suggested;
	}
	public void setAddress_suggested(String address_suggested) {
		this.address_suggested = address_suggested;
	}
	public Travel(Integer id, double initial_latitud, double initial_longitud, double suggested_latitud,
			double suggested_longitud, double final_latitud, double final_longitud, LocalDate date_init,
			LocalDate date_final, float distance, String address_initial, String address_final,
			String address_suggested) {
		super();
		this.id = id;
		this.initial_latitud = initial_latitud;
		this.initial_longitud = initial_longitud;
		this.suggested_latitud = suggested_latitud;
		this.suggested_longitud = suggested_longitud;
		this.final_latitud = final_latitud;
		this.final_longitud = final_longitud;
		this.date_init = date_init;
		this.date_final = date_final;
		this.distance = distance;
		this.address_initial = address_initial;
		this.address_final = address_final;
		this.address_suggested = address_suggested;
	}
	
	
	

}

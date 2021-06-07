package com.gmail.christian741.Main.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;


public class TravelDetail {

	private Integer id;
	private double latitud;
	private double longitud;
	private LocalDate date;
	private float distance;
}

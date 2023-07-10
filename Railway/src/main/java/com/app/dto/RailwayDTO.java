package com.app.dto;

import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;


import com.app.entities.Category;



public class RailwayDTO {
	
	@NotBlank(message = "name should not be blank")
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	@Past
	private LocalDateTime starttime;
	
	private LocalDateTime endtime;
	@NotBlank(message = "source should not be blank")
	private String source;
	@Min(value = 1)
	private int frequency;
	@Positive
	private int distance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDateTime getStarttime() {
		return starttime;
	}
	public void setStarttime(LocalDateTime starttime) {
		this.starttime = starttime;
	}
	public LocalDateTime getEndtime() {
		return endtime;
	}
	public void setEndtime(LocalDateTime endtime) {
		this.endtime = endtime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public RailwayDTO(@NotBlank(message = "name should not be blank") String name, Category category,
			@Past LocalDateTime starttime, @Future LocalDateTime endtime,
			@NotBlank(message = "source should not be blank") String source, @Positive int frequency,
			@Positive int distance) {
		super();
		this.name = name;
		this.category = category;
		this.starttime = starttime;
		this.endtime = endtime;
		this.source = source;
		this.frequency = frequency;
		this.distance = distance;
	}
	
	

}

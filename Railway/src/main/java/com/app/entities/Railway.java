package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.Table;

@Entity
@Table(name="railway")
public class Railway extends BaseEntity {
	@Column(length=20,nullable = false)
	private String name;
	@Column(length=20,nullable = false)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(length=20,nullable = false)
	private LocalDateTime starttime;
	@Column(length=20,nullable = false)
	private LocalDateTime endtime;
	@Column(length=20,nullable = false)
	private String source;
	@Column(length=20,nullable = false)
	private int frequency;
	@Column(length=20,nullable = false)
	private int distance;
	
	

	public Railway(Long id, String name, Category category, LocalDateTime starttime, LocalDateTime endtime,
			String source, int frequency, int distance) {
		super(id);
		this.name = name;
		this.category = category;
		this.starttime = starttime;
		this.endtime = endtime;
		this.source = source;
		this.frequency = frequency;
		this.distance = distance;
	}
	

	


	public Railway() {
		super();
	}





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
	
	
	
	

}

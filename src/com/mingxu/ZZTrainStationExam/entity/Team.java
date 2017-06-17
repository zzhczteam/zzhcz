package com.mingxu.ZZTrainStationExam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//班组
@Entity
@Table(name="t_team")
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//ID
	@Column
	private String name;//名称
	@Column
	private String introduction;//简介
	@Column
	private int workshopID;//所属车间ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getWorkshopID() {
		return workshopID;
	}
	public void setWorkshopID(int workshopID) {
		this.workshopID = workshopID;
	}
	
}

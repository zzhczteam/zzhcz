package com.mingxu.ZZTrainStationExam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//学习资料表
@Entity
@Table(name="t_studydata")
public class StudyData {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//ID
	@Column
	private String worktypeIDs;//工种IDs
	@Column
	private String dataAddress;//资料地址
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWorktypeIDs() {
		return worktypeIDs;
	}
	public void setWorktypeIDs(String worktypeIDs) {
		this.worktypeIDs = worktypeIDs;
	}
	public String getDataAddress() {
		return dataAddress;
	}
	public void setDataAddress(String dataAddress) {
		this.dataAddress = dataAddress;
	}
}

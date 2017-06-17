package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//第二阶段
@Entity
@Table(name = "t_secondStage")
public class SecondStage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;// Id
	@Column
	private int workshopID;// 车间ID
	@Column
	private int teamID;// 班组ID
	@Column
	private Date beginTime;// 开始时间
	@Column
	private Date endTime;// 结束时间
	@Column
	private int classHour;// 课时
	@Column
	private byte state;// 状态

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWorkshopID() {
		return workshopID;
	}

	public void setWorkshopID(int workshopID) {
		this.workshopID = workshopID;
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getClassHour() {
		return classHour;
	}

	public void setClassHour(int classHour) {
		this.classHour = classHour;
	}

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}
}

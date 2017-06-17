package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//第三阶段
@Entity
@Table(name="t_thirdStage")
public class ThirdStage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//id
	@Column
	private int teamID;//班组ID
	@Column
	private String photoAddress;//培训图片地址
	@Column
	private Date time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeamID() {
		return teamID;
	}
	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
	public String getPhotoAddress() {
		return photoAddress;
	}
	public void setPhotoAddress(String photoAddress) {
		this.photoAddress = photoAddress;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}

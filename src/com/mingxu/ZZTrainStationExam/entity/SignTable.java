package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//签到表
@Entity
@Table(name = "t_signTable")
public class SignTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;// id
	@Column
	private int personID;// 工号
	@Column
	private byte state;// 状态 0出勤 1旷课 2事假 3病假 4其他
	@Column
	private String remarks;// 备注
	@Column
	private int thirdStageID;// 第三阶段ID
	@Column
	private int trainingTaskID;// 培训任务ID
	@Column
	private Date time;// 时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getThirdStageID() {
		return thirdStageID;
	}

	public void setThirdStageID(int thirdStageID) {
		this.thirdStageID = thirdStageID;
	}

	public int getTrainingTaskID() {
		return trainingTaskID;
	}

	public void setTrainingTaskID(int trainingTaskID) {
		this.trainingTaskID = trainingTaskID;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
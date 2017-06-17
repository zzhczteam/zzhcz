package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//培训任务 三级
@Entity
@Table(name="t_trainingTask")
public class TrainingTask {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//id
	@Column
	private String firstStageIDs;//第一阶段IDs
	@Column
	private String sencondStageIDs;//第二阶段IDs
	@Column
	private String thirdStageIDs;//第三阶段IDs
	@Column
	private byte state;//状态
	@Column
	private Date time;//发布时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstStageIDs() {
		return firstStageIDs;
	}
	public void setFirstStageIDs(String firstStageIDs) {
		this.firstStageIDs = firstStageIDs;
	}
	public String getSencondStageIDs() {
		return sencondStageIDs;
	}
	public void setSencondStageIDs(String sencondStageIDs) {
		this.sencondStageIDs = sencondStageIDs;
	}
	public String getThirdStageIDs() {
		return thirdStageIDs;
	}
	public void setThirdStageIDs(String thirdStageIDs) {
		this.thirdStageIDs = thirdStageIDs;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}

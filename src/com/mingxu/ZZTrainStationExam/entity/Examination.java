package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//考试安排
@Entity
@Table(name="t_examination")
public class Examination {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String worktypeIDs;//工种IDs
	@Column
	private String questionIDs;//试题IDs
	@Column
	private String name;//考试名称
	@Column
	private String introductuion;//详情
	@Column
	private Date beginTime;//开始时间
	@Column
	private Date endTime;//结束时间
	
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
	public String getQuestionIDs() {
		return questionIDs;
	}
	public void setQuestionIDs(String questionIDs) {
		this.questionIDs = questionIDs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroductuion() {
		return introductuion;
	}
	public void setIntroductuion(String introductuion) {
		this.introductuion = introductuion;
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
}

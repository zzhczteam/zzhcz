package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//学习进度
@Entity
@Table(name="t_studySchedule")
public class StudySchedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//id
	@Column
	private int personID;//工号
	@Column
	private int studyDataID;//学习资料ID
	@Column
	private int page;//进度
	@Column
	private Date time;//时间
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
	public int getStudyDataID() {
		return studyDataID;
	}
	public void setStudyDataID(int studyDataID) {
		this.studyDataID = studyDataID;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}

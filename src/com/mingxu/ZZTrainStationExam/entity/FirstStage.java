package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//第一阶段
@Entity
@Table(name="t_firstStage")
public class FirstStage {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//id
	@Column
	private int departmentID;//发布部门id
	@Column
	private String name;//名称
	@Column
	private String content;//内容
	@Column
	private String dataAddress;//文件地址
	@Column
	private int workshopID;//针对车间
	@Column
	private Date beginTime;//开始时间
	@Column
	private Date endTime;//结束时间
	@Column
	private Date time;//发布时间
	@Column
	private int classHour;//课时
	@Column
	private byte state;//状态
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDataAddress() {
		return dataAddress;
	}
	public void setDataAddress(String dataAddress) {
		this.dataAddress = dataAddress;
	}
	public int getWorkshopID() {
		return workshopID;
	}
	public void setWorkshopID(int workshopID) {
		this.workshopID = workshopID;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
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

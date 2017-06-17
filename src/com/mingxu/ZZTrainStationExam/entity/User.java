package com.mingxu.ZZTrainStationExam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//人员信息
@Entity
@Table(name="t_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//工号
	@Column
	private String name;//姓名
	@Column
	private boolean sex;//性别  true 男
	@Column
	private Date brothday;//出生年月
	@Column
	private byte identity;//身份类别  0普通员工 1干部 。。。
	@Column
	private byte education;//文化程度 0高中 1中专 2大专 3本科 4硕士。。。
	@Column
	private String personId;//身份证号
	@Column
	private boolean personAttribute;//人员属性   是否在岗
	@Column
	private String technicalLevel;//技术等级
	@Column
	private String politicalOutlook;//政治面貌
	@Column
	private String wechatUid;//微信uid
	@Column
	private int departmentID;//部门ID 外键
	@Column
	private int workshopID;//车间ID 外键
	@Column
	private int teamID;//班组ID 外键
	@Column
	private int worktypeID;//工种ID 外键
	@Column
	private Date joinWorkTime;//参加工作时间
	@Column
	private Date joinCompanyTime;//进入公司时间
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
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Date getBrothday() {
		return brothday;
	}
	public void setBrothday(Date brothday) {
		this.brothday = brothday;
	}
	public byte getIdentity() {
		return identity;
	}
	public void setIdentity(byte identity) {
		this.identity = identity;
	}
	public byte getEducation() {
		return education;
	}
	public void setEducation(byte education) {
		this.education = education;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public boolean getPersonAttribute() {
		return personAttribute;
	}
	public void setPersonAttribute(boolean personAttribute) {
		this.personAttribute = personAttribute;
	}
	public String getTechnicalLevel() {
		return technicalLevel;
	}
	public void setTechnicalLevel(String technicalLevel) {
		this.technicalLevel = technicalLevel;
	}
	public String getPoliticalOutlook() {
		return politicalOutlook;
	}
	public void setPoliticalOutlook(String politicalOutlook) {
		this.politicalOutlook = politicalOutlook;
	}
	public String getWechatUid() {
		return wechatUid;
	}
	public void setWechatUid(String wechatUid) {
		this.wechatUid = wechatUid;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
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
	public int getWorktypeID() {
		return worktypeID;
	}
	public void setWorktypeID(int worktypeID) {
		this.worktypeID = worktypeID;
	}
	public Date getJoinWorkTime() {
		return joinWorkTime;
	}
	public void setJoinWorkTime(Date joinWorkTime) {
		this.joinWorkTime = joinWorkTime;
	}
	public Date getJoinCompanyTime() {
		return joinCompanyTime;
	}
	public void setJoinCompanyTime(Date joinCompanyTime) {
		this.joinCompanyTime = joinCompanyTime;
	}
}

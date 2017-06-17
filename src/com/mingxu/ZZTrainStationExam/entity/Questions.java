package com.mingxu.ZZTrainStationExam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//题库
@Entity
@Table(name="t_questions")
public class Questions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//ID
	@Column
	private String stem;//题干
	@Column
	private String[] rightAnwser;//正确答案
	@Column
	private String[] wrongAnswer;//错误答案
	@Column
	private byte type;//类型 0单选 1多选 2判断
	@Column	
	private String worktypeIDs;//针对工种 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStem() {
		return stem;
	}
	public void setStem(String stem) {
		this.stem = stem;
	}
	public String[] getRightAnwser() {
		return rightAnwser;
	}
	public void setRightAnwser(String[] rightAnwser) {
		this.rightAnwser = rightAnwser;
	}
	public String[] getWrongAnswer() {
		return wrongAnswer;
	}
	public void setWrongAnswer(String[] wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
	}
	public byte getType() {
		return type;
	}
	public void setType(byte type) {
		this.type = type;
	}
	public String getWorktypeIDs() {
		return worktypeIDs;
	}
	public void setWorktypeIDs(String worktypeIDs) {
		this.worktypeIDs = worktypeIDs;
	}
	
}

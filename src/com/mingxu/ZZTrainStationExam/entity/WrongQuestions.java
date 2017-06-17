package com.mingxu.ZZTrainStationExam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//错题表
@Entity
@Table(name="t_wrongQuestions")
public class WrongQuestions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;//id
	@Column
	private int personID;//工号
	@Column
	private int questionID;//错题ID
	@Column
	private boolean state;//状态  true可见 false不可见
	
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
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
}

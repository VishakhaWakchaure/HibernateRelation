package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String pan_no;
	@OneToOne
	private Person1 person1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public Person1 getPerson1() {
		return person1;
	}
	public void setPerson1(Person1 person1) {
		this.person1 = person1;
	}
	
	
}

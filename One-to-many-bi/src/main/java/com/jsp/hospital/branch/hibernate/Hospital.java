package com.jsp.hospital.branch.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String hname;
private String gst;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHname() {
	return hname;
}
public void setHname(String hname) {
	this.hname = hname;
}
public String getGst() {
	return gst;
}
public void setGst(String gst) {
	this.gst = gst;
}

}

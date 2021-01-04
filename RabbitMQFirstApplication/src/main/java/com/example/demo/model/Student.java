package com.example.demo.model;

import java.io.Serializable;

public class Student implements Serializable {

	private String sid;

	private String sname;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student(String sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

	
}

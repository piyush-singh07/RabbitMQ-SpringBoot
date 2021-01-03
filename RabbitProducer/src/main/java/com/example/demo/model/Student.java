package com.example.demo.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Student implements Serializable {

	private String sid;
	
	private String sname;

	public Student(String sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

}

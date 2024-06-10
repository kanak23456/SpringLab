package com.teacher.management.model;

import org.hibernate.annotations.Proxy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TeacherDetails")
@Proxy(lazy=false)

public class TeacherDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Subject")
	private String subject;
	
	
	public TeacherDetails() {
		super();
	
	}
	public TeacherDetails(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	

}

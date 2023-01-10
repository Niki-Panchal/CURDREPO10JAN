package com.miit.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Std")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long std_id;
	private String std_name;
	private String std_dept;
	public long getStd_id() {
		return std_id;
	}
	public void setStd_id(long std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_dept() {
		return std_dept;
	}
	public void setStd_dept(String std_dept) {
		this.std_dept = std_dept;
	}
	
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std_dept=" + std_dept + "]";
	}
	
	

}

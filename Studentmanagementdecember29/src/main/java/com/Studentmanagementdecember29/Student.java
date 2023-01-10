package com.Studentmanagementdecember29;

import javax.persisnce.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.annotation.processing.Generated;
import javax.management.ConstructorParameters;
@Entity
@Table(name="STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int roll_no;
	@Column(name="STUD_NAME")
	String name;
	@Column(name="STUD_MARKS")
	double marks;
	public Student(int roll_no, String name, double marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();

	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}
}

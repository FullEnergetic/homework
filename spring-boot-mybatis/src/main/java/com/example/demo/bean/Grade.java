package com.example.demo.bean;

import java.util.List;

public class Grade {
	private String Grade_Name ;
	private int id;
	private List<Student> students;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Grade(String grade_Name, int id, List<Student> students) {
		super();
		Grade_Name = grade_Name;
		this.id = id;
		this.students = students;
	}
	
	
	@Override
	public String toString() {
		return "Grade [Grade_Name=" + Grade_Name + ", id=" + id + ", students=" + students + "]";
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrade_Name() {
		return Grade_Name;
	}
	public void setGrade_Name(String grade_Name) {
		Grade_Name = grade_Name;
	}
	
	
	
	
}

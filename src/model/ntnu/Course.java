package model.ntnu;

import java.util.Date;

import model.UserGroup;

public class Course extends model.Course {

	protected model.UserGroup lecturers, vitasses, undasses, studasses;
	protected model.UserGroup students;
	protected Semester semester;
	protected int year;
	protected String code;
	
	public Course(UserGroup owner, String name, String code, Semester semester, int year) {
		super(owner, name);
		this.code = code;
		this.semester = semester;
		this.year = year;
	}

	public Date getStartDate() {
		// TODO implement
		return null;
	}

	public Date getEndDate() {
		// TODO implement
		return null;
	}
}

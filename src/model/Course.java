package model;

public class Course {
	protected String name;
	protected UserGroup owner, students;
	protected AssignmentGroup assignments;
	
	public Course(UserGroup owner, String name){
		this.owner = owner;
		this.name = name;
	}
}

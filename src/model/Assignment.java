package model;

import java.util.ArrayList;
import java.util.Date;

public class Assignment {
	protected String name, description;
	protected Date publishedDate, dueDate;
	protected ArrayList<Delivery> deliveries;
	
	public Assignment(String name, String description, Date publishedDate, Date dueDate){
		this.name = name;
		this.description = description;
		this.publishedDate = publishedDate;
		this.dueDate = dueDate;
	}
}

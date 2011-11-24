package model;

import java.util.Date;

public class Assessment {
	protected UserGroup assessors;
	protected String comment;
	protected Date assessedDate;
	
	public Assessment(UserGroup assessors, String comment, Date assessedDate) {
		this.assessors = assessors;
		this.comment = comment;
		this.assessedDate = assessedDate;
	}
	
	
}

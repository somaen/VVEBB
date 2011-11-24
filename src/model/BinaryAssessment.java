package model;

import java.util.Date;

public class BinaryAssessment extends Assessment {

	boolean approved;
	
	public BinaryAssessment(boolean approved, UserGroup assessors, String comment,
			Date assessedDate) {
		super(assessors, comment, assessedDate);
		approved = approved;
	}

}

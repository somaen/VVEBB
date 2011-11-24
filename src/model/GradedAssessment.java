package model;

import java.util.Date;

public class GradedAssessment extends Assessment {

	public enum Grade {
		F, E, D, C, B, A;
		
		public boolean isFail(){
			return this==F;
		}
	}
	
	Grade grade;
	
	public GradedAssessment(Grade grade, UserGroup assessors, String comment,
			Date assessedDate) {
		super(assessors, comment, assessedDate);
		grade = grade;
	}
}

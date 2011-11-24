package model;

import java.util.Date;

public class ScoreAssessment extends Assessment {

	double score;
	
	public ScoreAssessment(double score, UserGroup assessors, String comment,
			Date assessedDate) {
		super(assessors, comment, assessedDate);
		this.score = score;
	}
}

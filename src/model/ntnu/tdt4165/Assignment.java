package model.ntnu.tdt4165;

import java.util.Date;
import model.files.*;

public class Assignment extends model.Assignment {
	PublishedFileGroup problemFiles, solutionFiles;
	
	public Assignment(String name, String description, Date publishedDate,
			Date dueDate, PublishedFileGroup problemFiles, PublishedFileGroup solutionFiles) {
		super(name, description, publishedDate, dueDate);
		this.problemFiles = problemFiles;
		this.solutionFiles = solutionFiles;
	}

	
}

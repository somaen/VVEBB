package model.files;

import java.util.Date;

public class PublishedFileGroup extends FileGroup {
	Date startDate=null, endDate=null;
	
	public PublishedFileGroup(Date startDate, Date endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public boolean isPublished(Date date) {
		return date.after(startDate) && date.before(endDate);
	}
	
}

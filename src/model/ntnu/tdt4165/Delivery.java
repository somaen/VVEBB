package model.ntnu.tdt4165;

import model.UserGroup;
import model.files.FileGroup;

public class Delivery extends model.Delivery {
	FileGroup files;
		
	public Delivery(UserGroup userGroup, FileGroup files) {
		super(userGroup);
		this.files = files;
	}

}

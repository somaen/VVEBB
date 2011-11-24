package model.files;

public class File {
	String name, path, title;
	FileType type;
	public File(String name, String path, String title, FileType type) {
		super();
		this.name = name;
		this.path = path;
		this.title = title;
		this.type = type;
	}

	public File(String name, String path, String title) {
		super();
		this.name = name;
		this.path = path;
		this.title = title;
		// TODO find type from name
	}
	
}

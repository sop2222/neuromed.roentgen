package ru.neuromed.roentgen.db;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class fileRecord {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String fileName;
	private String fileDescription;
	private String fileIsMapped;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileDescription() {
		return fileDescription;
	}
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}
	public String getFileIsMapped() {
		return fileIsMapped;
	}
	public void setFileIsMapped(String fileIsMapped) {
		this.fileIsMapped = fileIsMapped;
	}

}

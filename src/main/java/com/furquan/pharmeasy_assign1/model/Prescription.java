/**
 * 
 */
package com.furquan.pharmeasy_assign1.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Furquan
 *
 */
@Entity
@Table(name = "PRESCRIPTION")
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Date createdOn;
	private byte[] dataFile;
	private String fileName;
	private long ownerId;

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public byte[] getDataFile() {
		return dataFile;
	}

	public void setDataFile(byte[] dataFile) {
		this.dataFile = dataFile;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

}

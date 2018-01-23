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
@Table(name = "PRESCRIPTION_ACCESS_CONTROL")
public class PrescriptionAccessControl {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long prescriptionId;
	private long userId;
	private String accessLevel;
	private Date providedOn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(long prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public Date getProvidedOn() {
		return providedOn;
	}

	public void setProvidedOn(Date providedOn) {
		this.providedOn = providedOn;
	}

	@Override
	public String toString() {
		return "PrescriptionAccessControl [id=" + id + ", prescriptionId=" + prescriptionId + ", userId=" + userId
				+ ", accessLevel=" + accessLevel + ", providedOn=" + providedOn + "]";
	}

}

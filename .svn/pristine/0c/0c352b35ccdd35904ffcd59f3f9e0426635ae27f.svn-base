package com.prelude.epsilon.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
	 
@Entity
@Table(name = "vacation")
public class Vacation {
 
	private int requestID;
	private User user;
	private Date dateCreated;
	private Date startDate;
	private Date endDate;
	private String status;
	private int modifiedBy;
	private Date modifiedDate;
	private String reason;
	
	public Vacation() {
	}
	 
 
	public Vacation(int requestID, User user, Date startDate, Date endDate,
							Date dateCreated, String status) {
		this.requestID = requestID;
		this.user = user;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dateCreated = dateCreated;
		this.status = status;
	}
	 
	@Id
	@Column(name = "REQUEST_ID")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getRequestID() {
		return this.requestID;
	}
 
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
 
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "USER_ID", nullable = false)
	public User getUser() {
		return this.user;
	}
 
	public void setUser(User user) {
		this.user = user;
	}
 
	@Column(name = "DATE_CREATED")
	public Date getDateCreated() {
		return this.dateCreated;
	}
 
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
 
	@Column(name = "START_DATE")
	public Date getStartDate() {
		return this.startDate;
	}
 
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
 
	@Column(name = "END_DATE")
	public Date getEndDate() {
		return this.endDate;
	}
 
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
 
	@Column(name = "STATUS")
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "MODIFIED_BY")
	public int getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "MODIFIED_DATE")
	public Date getModifiedDate() {
		return this.modifiedDate;
	}
 
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
 
	@Column(name = "REASON")
	public String getReason() {
		return this.reason;
	}
 
	public void setReason(String reason) {
		this.reason = reason;
	}
}

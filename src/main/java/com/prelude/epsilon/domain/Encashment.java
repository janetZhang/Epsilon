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
@Table(name = "encashment")
public class Encashment {
	
	private int requestId;
	private User creator;
	private int approverId;
	private int modifierId;
	private int encashedHours;
	private String status="pending";
	private Date createdDate;
	private Date modifiedDate;
	private String comment;
	
	public Encashment() {
	} 
//	public Encashment(String requestID, User user, Date startDate, Date endDate,
//							Date dateCreated, String status) {
//		this.requestID = requestID;
//		this.user = user;
//		this.startDate = startDate;
//		this.endDate = endDate;
//		this.dateCreated = dateCreated;
//		this.status = status;
//	}
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "REQUEST_ID")
	public int getRequestId() {
		return this.requestId;
	}
 
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
 
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CREATED_BY",referencedColumnName="USER_ID", nullable = false)//
	public User getCreator() {
		return this.creator;
	}
 
	public void setCreator(User user) {
		this.creator = user;
	}
	@Column(name = "APPROVED_BY")
	public int getApproverId() {
		return this.approverId;
	}
 
	public void setApproverId(int approverId) {
		this.approverId = approverId;
	} 
	@Column(name = "MODIFIED_BY")
	public int getModifierId() {
		return modifierId;
	}

	public void setModifierId(int modifierId) {
		this.modifierId = modifierId;
	}	
	@Column(name = "ENCASHED_HOURS")
	public int getEncashedHours(){
		return encashedHours;
	}
	public void setEncashedHours(int hours) {
		this.encashedHours = hours;
	}	
	@Column(name = "STATUS", columnDefinition="char(10) default 'new'")
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
////	@Temporal(TemporalType.TIMESTAMP)
//	@PrePersist
//	protected void onCreate() {
//		this.createdDate = new Date();
//	}	
	@Column(name = "CREATED_DATE")
	public Date getCreatedDate() {
		return this.createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	} 
//	
//	@PreUpdate
//	protected void onUpdate() {
//		this.modifiedDate = new Date();
//	}	
	@Column(name = "MODIFIED_DATE")
	public Date getModifiedDate() {
		return this.modifiedDate;
	}
 
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
 
	@Column(name = "COMMENT")
	public String getComment() {
		return this.comment;
	}
 
	public void setComment(String comment) {
		this.comment = comment;
	}
}

/*  USER DAO
<!--  Revision History	: -->
<!--  Version		Created/Modified by			Date			Comments -->
<!--  1.0			Ranu Kundu			       03/12/2015		Created -->
<!--  1.1			Suneetha Nagendra		   03/13/2015		Updated	Annotations -->
/*This is User table entity object.
 * Revision History	:
 * Version		Created/Modified by			Date			Comments
 * 1.0			Ranu Kundu			     	03/12/2015		Created
 * 1.1			Suneetha Nagendra			03/13/2015		Added Revision history
 * 1.2			Suneetha Nagendra			03/13/2015		Added designation field
 * 1.3			Ranu Kundu       			03/17/2015		Added ManyToOne/OneToMany Annotations
 * 
 * 
*/


package com.prelude.epsilon.domain;

import java.sql.*;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
@Table(name="user")
public class User {
	private int user_ID;
	private String employee_ID;
	private	Role role;
	private String manager_ID;
	private String email_ID;
	private String password;
	private String firstName;
	private String lastName;	
	private String address;	
	private String phone;	
	private String designation;
	private String dateOfBirth;	
	private String dateOfJoin;	
	private String status;
	private Set<Vacation> vacation;
	private Set<Encashment> encashment;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	public int getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}
	
	@Column(name="EMPLOYEE_ID")
	public String getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(String employee_ID) {
		this.employee_ID = employee_ID;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ROLE_ID")	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name="MANAGER_ID")	
	public String getManager_ID() {
		return manager_ID;
	}
	public void setManager_ID(String manager_ID) {
		this.manager_ID = manager_ID;
	}
	
	@Column(name="EMAIL_ID")
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	 
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="FIRSTNAME")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name="LASTNAME")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="PHONE")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name="DESIGNATION")
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Column(name="DOB")
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Column(name="DOJ")
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	@Column(name="STATUS")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "user")
	public Set<Vacation> getVacation() {
		return vacation;
	}
	public void setVacation(Set<Vacation> vacation) {
		this.vacation = vacation;
	}	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "creator")
	public Set<Encashment> getEncashment() {
		return encashment;
	}
	public void setEncashment(Set<Encashment> encashmentSet) {
		this.encashment = encashmentSet;
	}	
}


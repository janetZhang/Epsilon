package com.prelude.epsilon.domain;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	private int roleId;
	private String roleName;
	private String roleDesc;
	private Set <User> users;
	
	public Role(){
		
	}
	
	public Role(int roleID, String roleName){
		this.roleId = roleID;
		this.roleName = roleName;
	}
	
	@Id
	@Column(name="ROLE_ID")
	public int getRoleID() {
		return roleId;
	}
	public void setRoleID(int roleID) {
		this.roleId = roleID;
	}
	@Column(name="ROLE_NAME")
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Column(name="ROLE_DESC")
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "role", cascade = CascadeType.ALL)
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}

}

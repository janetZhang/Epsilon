package com.prelude.epsilon.logic;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.prelude.epsilon.DAO.UserDAOImpl;
import com.prelude.epsilon.domain.User;
import com.prelude.epsilon.util.HibernateUtil;

public class LoginBusinessLogic {
	public User authenticateUser(String emailID, String password) {
		User user = new UserDAOImpl().getUserByEmailId(emailID);
		if (!user.equals(null)){
			if(user.getPassword().equals(password)){
				return user;
			}
		}
		return user;
	}
	public int checkUserStatus(User user) {
		if(user.getStatus().equals("active")) {
			return 1;	
		} else if (user.getStatus().equals("new")){
			return 2;
		} else {
			return 0;
		}
	}
	public int getUserRole(User user) {
		return user.getRole().getRoleID();
	}
}

package com.prelude.epsilon.logic;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.prelude.epsilon.DAO.UserDAO;
import com.prelude.epsilon.DAO.UserDAOImpl;
import com.prelude.epsilon.DAO.VacationDAO;
import com.prelude.epsilon.DAO.VacationDAOImpl;
import com.prelude.epsilon.domain.User;
import com.prelude.epsilon.domain.Vacation;

public class VacationLogic {
	public boolean vacationRequest(String userID, Date startDate, Date endDate, String reason) {
		Vacation vacReq = new Vacation();
		vacReq.setStartDate(startDate);
		vacReq.setEndDate(endDate);
		User user = new UserDAOImpl().getUserByEmailId(userID);
		vacReq.setUser(user);
		vacReq.setReason(reason);
		new VacationDAOImpl().addVacationReq(vacReq);
		return true;
	}
	public Set<Vacation> searchVacationByEmailId(String emailId){
		UserDAO dao = new UserDAOImpl(); 
		User u = dao.getUserByEmailId(emailId);
		Set<Vacation> vacationList = null;
		if(u!=null)
		vacationList = u.getVacation();	
		return vacationList;
	}
}

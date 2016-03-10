package com.prelude.epsilon.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;

import com.prelude.epsilon.domain.Role;
import com.prelude.epsilon.domain.User;
import com.prelude.epsilon.domain.Vacation;
import com.prelude.epsilon.util.HibernateUtil;

public class VacationDAOImpl implements VacationDAO {
	/**
	 * This method is used to insert a new
	 *  vacation request to the vacation table.
	 *  Returns true on success and false on failure.
	 **/
	public boolean addVacationReq(Vacation vacReq) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(vacReq);
		session.flush();
		session.getTransaction().commit();
		return true;
	}
	/**
	 * This method is used to update a database entry.
	 * It is used by Admin to modify a vacation.
	 * No object is returned if the query fails.
	 **/
	public boolean updateVacation(Vacation vacReq) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(vacReq);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}
	/**
	 * This method is used to delete a database entry.
	 * It is used by Admin to delete a vacation.
	 * Returns true on success and false on failure.
	 **/		
	public boolean deleteVacation(Vacation vacReq) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(vacReq);
		session.getTransaction().commit();
		session.close();
		return true;
	}
	/**
	 * This method is used to retrieve a vacation object
	 * by its ID. It takes vacation request ID as an argument.
	 * This can be used to modify a particular vacation.
	 * Can be used by Manager to approve/reject a pending
	 * request and by Admin to modify a request. Returns true 
	 * on success and false on failure.
	 **/
	public Vacation getVacationByReqID(int vacationID) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String query = "from Vacation where REQUEST_ID = :request_id";
		Query qry = session.createQuery(query);
		qry.setParameter("request_id", vacationID);
		List <Vacation> vacations = qry.list();	
		session.flush();
		session.getTransaction().commit();
		session.close();
		return vacations.get(0);
	}
	/**
	 * This method is used to retrieve a list of vacation objects
	 * made by the same user. It takes user object as an argument.
	 * This is used to display vacation summary on the employee
	 * dashboard. No object is returned if the query fails.
	 **/	
	public List <Vacation> getVacationsByUser(User user) {
		List <Vacation> lst;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String query = "from Vacation where user = :user";
		Query qry = session.createQuery(query);
		qry.setParameter("user", user);
		List <Vacation> vacations = qry.list();	
		session.flush();
		session.getTransaction().commit();
		session.close();
		return vacations;
	}
	/**
	 * This method is used to retrieve a list of vacation objects
	 * for the same user i.e. for Manager. It takes user object
	 * as an argument. This is used to display pending vacation
	 * requests on the manager dashboard. No object is returned
	 * if the query fails.
	 **/
	public List <Vacation> getVacationsForUser(User user) {
		List <Vacation> lst = new ArrayList();
		return lst; 
	}
/*
	public static void main(String[] args) {
		VacationDAOImpl vacImpl = new VacationDAOImpl();
		Vacation vacReq = new Vacation();

		vacReq.setRequestID(5);
		UserDAOImpl uimpl = new UserDAOImpl();
		List <User>usrLst =(List<User>) uimpl.getUserByEmail("user1@preludesys.com");
		User user = usrLst.get(0);
		vacReq.setUser(user);
		vacImpl.addVacationReq(vacReq);

		vacReq = vacImpl.getVacationByReqID(5);
		if (vacReq != null) {
			vacImpl.deleteVacation(vacReq);
			System.out.println("vacation to be deleted : " + vacReq);
		} else {
			System.out.println("No vacations with this ID exists");
		}

		UserDAOImpl uimpl = new UserDAOImpl();
		List <User>usrLst =(List<User>) uimpl.getUserByEmail("user1@preludesys.com");
		User user = usrLst.get(0);
		List <Vacation> vacations = vacImpl.getVacationsByUser(user);
		
		for (int index = 0; index < vacations.size(); index++) {
			System.out.print(vacations.get(index).getRequestID() + "\t");
			System.out.println(vacations.get(index).getStatus());
		}

		vacReq = vacImpl.getVacationByReqID(1);
		if (vacReq != null) {
			vacReq.setReason("On going project");
			vacImpl.updateVacation(vacReq);
		} else {
			System.out.println("No vacations with this ID exists");
		}
	}
*/
}

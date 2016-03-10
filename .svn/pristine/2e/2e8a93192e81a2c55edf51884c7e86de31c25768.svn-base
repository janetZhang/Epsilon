package com.prelude.epsilon.DAO;

import java.util.List;

import org.hibernate.Session;

import com.prelude.epsilon.domain.Encashment;
import com.prelude.epsilon.domain.User;

public interface EncashDAO {
	public Session openSession();
	public Session closeSession();
	public Encashment getEncashById(int id);
	/**
	 *  add Encashment object {@code Encashment}
	 * @param Encashment
	 */
	public void addEncashment(Encashment Encashment);
   /**
    * Delete encashment 
    * @param encashment
    */	
	public void removeEncashment(Encashment encashment);
   /**
    * update encashment object
    * 
    */	
	public void updateEncashment(Encashment encashment);
	/**
	 * Search encashment by creator name;
	 */	
	public List<Encashment> searchEncashByFirstName(String firstName); 
	/**
	 * This method is used to retrieve a list of encashment objects
	 * made by the same user. It takes user object as an argument.
	 * This is used to return encashment objects by searching any variable of user object.
	 *  No object is returned if no matching is found.
	 **/	
	public List <Encashment> searchEncashmentByCreator(User user);
}

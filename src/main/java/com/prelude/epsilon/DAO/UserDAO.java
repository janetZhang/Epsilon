/*This is an interface which contains the method declarations required for the user*/

package com.prelude.epsilon.DAO;

import java.util.List;

import com.prelude.epsilon.domain.Role;
import com.prelude.epsilon.domain.User;

public interface UserDAO {
	 
	    /*This method is used to insert 
	    an user into the database.*/
		public void addUser(User u);
		/*This method is used to update 
		an user in the database.*/
		public void updateUser(User u);
		/*This method is used to delete an user 
		from the database.*/
		public void deleteUser(User user);
		/*This method gets a role of an user by id*/
		public Role getRoleByID(Role r, int id);
		/*This method gets the user by their email id.
		This returns the user information as an object.*/
	    public User getUserByEmailId(String email);
	    /*This method gets the list of users by their first name.
	    It returns a list of users who have similar first names*/
	    public List<User> getUserByFirstName(String firstname);
	   
 

}

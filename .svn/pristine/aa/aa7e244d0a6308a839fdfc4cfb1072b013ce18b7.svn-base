package com.prelude.epsilon.logic;
import com.prelude.epsilon.DAO.UserDAOImpl;
import com.prelude.epsilon.domain.Role;
import com.prelude.epsilon.domain.User;

public class UserBOImpl {

	public static void addUserImpl(int roleid,String address,String fname,String lname,
			String email,String contact,String dob,String doj,String pwd,String status)
	{
		User user = new User();
		user.setFirstName(fname);
		
		user.setPhone(contact);
		user.setStatus(status);
		user.setDateOfBirth(dob);
		user.setDateOfJoin(doj);
		user.setAddress(address);
		user.setPassword(pwd);
		user.setEmail_ID(email);
		user.setLastName(lname);
		user.setUser_ID(3);
		UserDAOImpl userimpl = new UserDAOImpl();
		Role role = userimpl.getRoleByID(new Role(),roleid);
		user.setRole(role);
		userimpl.addUser(user);
		//return true;
	}
	public boolean updateUserImpl(int roleid,String address,String fname,String lname,
			String email,String contact,String dob,String doj,String pwd,String status)
	{
		User user = new User();
		user.setFirstName(fname);
		
		user.setPhone(contact);
		user.setStatus(status);
		user.setDateOfBirth(dob);
		user.setDateOfJoin(doj);
		user.setAddress(address);
		user.setPassword(pwd);
		user.setEmail_ID(email);
		user.setLastName(lname);
		user.setUser_ID(1);
		UserDAOImpl userimpl = new UserDAOImpl();
		//Role role = userimpl.getRoleID(new Role(),roleid);
		//user.setRole(role);
		userimpl.updateUser(user);
		return true;
	}
	public static void main(String[] args)
	{
		addUserImpl(2,"hfd","jfjkg","hdfhd","jfdh","hd","dhks","fhg","fdd","jdfk");
	}
}

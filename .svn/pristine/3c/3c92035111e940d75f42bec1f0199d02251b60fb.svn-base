/*Created By Ranu*/
package com.prelude.epsilon.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.prelude.epsilon.domain.Role;
import com.prelude.epsilon.domain.User;
import com.prelude.epsilon.util.HibernateUtil;


public class UserDAOImpl implements UserDAO{

			
			public Role getRoleByID(Role r,int id)
			{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				Role role = (Role) session.get(Role.class, id);
				session.getTransaction().commit();
				return role;
			}
			public void addUser(User user)
			{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.save(user);
				//session.flush();
				session.getTransaction().commit();
				
			}
			public void updateUser(User user)
			{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				session.update(user);
				session.getTransaction().commit();
			}
			public void deleteUser(User use)
			{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				//Query query = session.createQuery("from User where email_id= :email");
				//query.setParameter("email", email);
				Query query = session.createQuery("from User where email_id= :email");
				query.setParameter("email", "ranu_k@preludesys.com");
				List<User> user =  query.list();
				session.delete(user.get(0));
				session.getTransaction().commit();
			}
			public User getUserById(int id)
			{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				User user = (User)session.get(User.class, id);
				session.getTransaction().commit();
				session.close();
				return user;
			}
			public User getUserByEmailId(String email)
			{
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				Query query = session.createQuery("from User where email_id= :email");
				query.setParameter("email", email);
				List<User> List =  query.list();
				User user = new User();
				session.getTransaction().commit();
				if(List.isEmpty()){
					user = null;
				}else{
					user=List.get(0);
				}
				return user;
			}
			public List<User> getUserByFirstName(String fname)
			{ 
				Session session = HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();
				Query query = session.createQuery("from User where firstname = :fname");
				query.setParameter("fname", fname);
				List<User> user =  query.list();
				session.getTransaction().commit();
				return user;
				
			}
			public User searchUserByFirstName(String firstname) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
}




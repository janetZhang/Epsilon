
/*  Hibernate Util -->
<!--  Revision History	: -->
<!--  Version		Created/Modified by			Date			Comments -->
<!--  1.0			Ranu Kundu			     03/12/2015		     Created -->
	 */


package com.prelude.epsilon.util;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory buildSessionFactory(){
		try{
			Configuration conf= new Configuration();
		
			Configuration configuration = new Configuration().configure(); 
			
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder(). 
				applySettings(configuration.getProperties());
			SessionFactory factory = configuration.buildSessionFactory(builder.build()); 
			return factory;
		}catch(Throwable ex){
			System.err.println("Initial SessionFactory sreation failed "+ex);
			throw new ExceptionInInitializerError();
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}

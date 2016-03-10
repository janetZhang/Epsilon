package com.prelude.epsilon.controller;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.prelude.epsilon.domain.User;
import com.prelude.epsilon.logic.UserLogic;
import com.prelude.epsilon.util.HibernateUtil; 
import com.prelude.epsilon.DAO.UserDAO;
import com.prelude.epsilon.DAO.UserDAOImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	@RequestMapping("/reset")   
	protected ModelAndView  guidToReset(){
		ModelAndView mv = new ModelAndView("change-password");
		mv.addObject("UserId", "0");
		return mv;
	}
	@RequestMapping("/resetPassword.do")   
	protected ModelAndView resetPassword(
			@RequestParam("userId") String id,
			@RequestParam("password") String oldPassword,
			@RequestParam("newPswd") String newPassword,
			HttpSession session
			){
		String message="", dispatcherPage = "";
		Boolean success; 
		UserLogic logic = new  UserLogic();
		success = logic.resetPassword(id,oldPassword,newPassword );
		if(success){
			message = "Reset password successfully!";
			dispatcherPage = "success";
		}else{
			message = "The old password is wrong!";
			dispatcherPage = "change-password";
		}
		ModelAndView mv = new ModelAndView(dispatcherPage);
		mv.addObject("message", message);
		return mv;
	}
	@RequestMapping(value="/velocity", method=RequestMethod.GET) 
	protected ModelAndView velocityRequest(){
		ModelAndView mv = new ModelAndView("dashboard");
		mv.addObject("welcomeMessage", "Hi, Welcome to Spring MVC annotaion");
		return mv; 
	}	
	@RequestMapping(value="/add.do", method=RequestMethod.GET) 
	protected ModelAndView addUserPage(ModelMap mm){
		ModelAndView mv = new ModelAndView("admin-dashboard");
		mv.addObject("welcomeMessage", "Hi, Welcome to Spring MVC annotaion");
		return mv; 
	}	
	@RequestMapping(value="/addUser.do", method=RequestMethod.GET) 
	protected ModelAndView addUser(ModelMap mm){
		ModelAndView mv = new ModelAndView("success");
		System.out.println("Add user done--------------");
		
		
		//UserDao user= new UserDao
		mv.addObject("welcomeMessage", "Hi, Welcome to Spring MVC annotaion");
		return mv; 
	}
	@RequestMapping(value="/updateuser.jsp", method=RequestMethod.GET) 
	protected String updateUser(@RequestParam("user_id") String userID,
			@RequestParam("password") String password){
	    System.out.println("--Update User--");
	    UserDAOImpl userDao= new UserDAOImpl();
	//	userDao.updateUser();
		//List<User> users = 	
		return "";
	}	
	

}

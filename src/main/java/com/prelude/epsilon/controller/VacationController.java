package com.prelude.epsilon.controller;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prelude.epsilon.domain.Vacation;
import com.prelude.epsilon.logic.VacationLogic;


@Controller
public class VacationController {
	@RequestMapping(value = "/vacationReq", method = RequestMethod.POST)
	protected ModelAndView handleRequestInternal (
							@RequestParam("employeeId") String userID,
							@RequestParam("startdate")
								@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")Date startDate,
							@RequestParam("enddate")
								@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")Date endDate,
							@RequestParam("reason") String reason) {
		
		boolean result = new VacationLogic().vacationRequest(userID,startDate,endDate,reason);
		ModelAndView mv;
		if (result) {
//			mv = new ModelAndView("employee-dashboard");
			mv = new ModelAndView("admin-dashboard");
		} else {
			mv = new ModelAndView("error");
			mv.addObject("message", "Vacation Request could not be completed.");
		}
		return mv;
	}
	@RequestMapping(value="/vacationRequest.do", method=RequestMethod.GET) 
	protected ModelAndView submitvacPage(ModelMap mm){
		ModelAndView mv = new ModelAndView("vacationRequest");
		mv.addObject("welcomeMessage", "");
		return mv; 
	}
	
	@RequestMapping(value="/manageVacation", method=RequestMethod.GET) 
	protected ModelAndView adminPage(ModelMap mm){
		ModelAndView mv = new ModelAndView("admin-vacation");
		mv.addObject("message", "Here is the search page.");
		return mv; 
	}	
	@RequestMapping(value="/searchVacation", method=RequestMethod.POST) 
	protected String searchVacation(ModelMap mm,@RequestParam("emailId") String emailId){
		VacationLogic logic = new VacationLogic();
		Set<Vacation> vList = logic.searchVacationByEmailId(emailId);
	
		mm.addAttribute("listofVacation",vList );
		if(vList==null)
		mm.addAttribute("message"," No result for this emailId: "+emailId);
		return "searchVacation";
	}	
	

}

package com.prelude.epsilon.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prelude.epsilon.domain.Encashment;
import com.prelude.epsilon.logic.EncashLogic;

@Controller
public class EncashController {
	@RequestMapping("/encashRequest.do")
	protected ModelAndView addEncashmentRequest(
			@RequestParam("creatorId") String id,
			@RequestParam("encashedHours") String encashedHours) {
		String dispatchPage = "success";
		Boolean success;
		EncashLogic encashLogic = new EncashLogic();
		success = encashLogic.addEncashmentRequest("1", "8");
		if (success) {
			dispatchPage = "success";
			System.out.println("Dispatch to successful page.");
		} else {
			dispatchPage = "error";
			System.out.println("Dispatch to fail page.");
		}
		ModelAndView mv = new ModelAndView(dispatchPage);
		mv.addObject("message", "Send some info");
		return mv;
	}

	@RequestMapping("/encashRemove.do")
	protected ModelAndView removeEncashmentRequest(
			@RequestParam("requestId") String encashmentId) {
		String dispatchPage = "success";
		Boolean success;
		EncashLogic encashLogic = new EncashLogic();
		success = encashLogic.removeEncashmentRequest(encashmentId);
		if (success) {
			dispatchPage = "success";
			System.out.println("Dispatch to successful page.");
		} else {
			dispatchPage = "error";
			System.out.println("Dispatch to fail page.");
		}
		ModelAndView mv = new ModelAndView(dispatchPage);
		mv.addObject("message", "Send some info");
		return mv;
	}

	@RequestMapping("/encashApprove.do")
	protected ModelAndView approveEncash(@RequestParam("encashId") String id,
			@RequestParam("approverId") String oldPassword) {
		String dispatchPage = "success";
		Boolean success;
		EncashLogic encashLogic = new EncashLogic();
		success = encashLogic.arrpoveEncash("1", "2");
		if (success) {
			dispatchPage = "success";
			System.out.println("Dispatch to successful page.");
		} else {
			dispatchPage = "error";
			System.out.println("Dispatch to fail page.");
		}
		ModelAndView mv = new ModelAndView(dispatchPage);
		mv.addObject("message", "Send some info");
		return mv;
	}

	@RequestMapping(value = "/encashSearch.do", method = RequestMethod.GET)
	protected String searchEncashmentRequest(ModelMap mm,
			@RequestParam("firstName") String firstName) {
		String dispatchPage = "success";
		Boolean success;
		EncashLogic encashLogic = new EncashLogic();
		List<Encashment> list = encashLogic.searchEncashByFirstName(firstName); //1st method
	//	 List<Encashment> list = encashLogic.searchEncashByCreator(firstName); //2nd method
		// User());
		success = list.size() > 0 ? true : false;
		if (success) {
			dispatchPage = "success";
			System.out.println("Dispatch to successful page.");
		} else {
			dispatchPage = "error";
			System.out.println("Dispatch to fail page.");
		}
		mm.addAttribute("encashmentList", list);
		return "searchEncashPage";
	}

	public static void main(String[] arg) {
		Boolean success;
		EncashLogic encashLogic = new EncashLogic();
		success = encashLogic.addEncashmentRequest("2", "16");
		if (success) {
			System.out.println("Dispatch to successful page.");
		} else {
			System.out.println("Dispatch to fail page.");
		}
	}
}

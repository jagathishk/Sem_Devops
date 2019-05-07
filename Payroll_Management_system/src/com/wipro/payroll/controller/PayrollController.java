package com.wipro.payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.payroll.model.PayrollBean;
import com.wipro.payroll.service.payrollservice;
//import com.wipro.payroll.service.payrollservice
@Controller
public class PayrollController {

	@Autowired
	private payrollservice payrollservice;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String init() {
		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegister(@ModelAttribute("PayrollBean") PayrollBean payr) {
		if (payr != null && payr.getName() != null && payr.getUsername() != null && payr.getPassword()!= null && payr.getCpassword()!=null)
				 {
			return  "success";
		} else {
			return "error";
		}
	}
}

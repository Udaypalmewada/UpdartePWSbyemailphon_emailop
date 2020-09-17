package com.url.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.url.app.bean.FogetRequest;
import com.url.app.service.ForgetService;

@Controller
public class ForgetController {
	@Autowired
	private ForgetService fs;

	@RequestMapping(path = "forget", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("forgetPWD") FogetRequest requeast, Model model, HttpSession session) {
		if (requeast.getEmail() == null) {
			fs.byMob(requeast.getPhonNumber());
		
		} 
		else {
			fs.byMobEmail(requeast.getPhonNumber(),requeast.getEmail());
		}

		return null;

	}
}

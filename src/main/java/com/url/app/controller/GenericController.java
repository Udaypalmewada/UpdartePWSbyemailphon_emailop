package com.url.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.url.app.bean.FogetRequest;

@Controller
public class GenericController {
	@RequestMapping(" ")
	public ModelAndView homePage(Model model) {
		model.addAttribute("forgetPWD", new FogetRequest());
		return new ModelAndView("welcome");
	}

}

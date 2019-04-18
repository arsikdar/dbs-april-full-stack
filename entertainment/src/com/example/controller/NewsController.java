package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewsController {

	@RequestMapping(path="/news")
	public String showNews() {
		System.out.println("Inside NewsController.showNews()!!");
		return "newsDetail";
	}

	@RequestMapping(path="/news/breaking")
	public ModelAndView showBreakingNews() {
		System.out.println("Inside NewsController.showBreakingNews()!!");
		ModelAndView modelAndView = new ModelAndView("newsDetail", "BREAKING-NEWS", "Training will finish at 11 PM");
		return modelAndView;
	}

	@RequestMapping(path="/news/politics")
	public ModelAndView showPoliticsNews() {
		System.out.println("Inside NewsController.showPoliticsNews()!!");
		ModelAndView modelAndView = new ModelAndView("newsDetail", "BREAKING-NEWS", "BJP is about to win");
		return modelAndView;
	}

}

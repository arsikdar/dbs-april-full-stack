package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {

	@RequestMapping(path="/weather")
	public String showWeather() {
		System.out.println("Inside WeatherController.showWeather()!!");
		return "weather";
	}

	@RequestMapping(path="/weather/india")
	public ModelAndView showWeatherIndia() {
		System.out.println("Inside WeatherController.showWeatherIndia()!!");
		ModelAndView modelAndView = new ModelAndView("weather", "WEATHER", "12 degree low,55 degree high");
		return modelAndView;
	}

}

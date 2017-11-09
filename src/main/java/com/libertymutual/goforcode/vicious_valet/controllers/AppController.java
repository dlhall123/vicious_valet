package com.libertymutual.goforcode.vicious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vicious_valet.models.Car;
import com.libertymutual.goforcode.vicious_valet.models.Lot;

@Controller
public class AppController {
	private Lot carLot;
	  
	public AppController() {
		carLot = new Lot(5);
	}
	
	
	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCar(carIndex);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView defaultPage(String license, String state, String color, String make, String model) {
		//if license is not null, and the length of license is greater than 0
			//create a new instance of the Car  class from the values submitted
		if(license != null && license.length() > 0) {
			Car car;
			car = new Car(license, state, color, make, model);
			//Park the car in the Lot
			//We need to add a method to the lot class and call that method
			carLot.addCar(car);
		}
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}
	

}

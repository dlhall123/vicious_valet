package com.libertymutual.goforcode.vicious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vicious_valet.models.Car;
import com.libertymutual.goforcode.vicious_valet.models.Lot;
import com.libertymutual.goforcode.vicious_valet.services.CarRepository;
import com.libertymutual.goforcode.vicious_valet.services.LotRepository;

@Controller
public class AppController {
	private CarRepository carRepo;
	private LotRepository lotRepo;
	Lot carLot;

	public AppController(CarRepository c, LotRepository l) {
		carRepo = c;
		lotRepo = l;
		carLot = new Lot(10);
		lotRepo.save(carLot);
	}

	@RequestMapping("/")
	public ModelAndView defaultPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}

	@RequestMapping("/addCar")
	public ModelAndView addCar(String license, String state, String color, String make, String model) {
		// if license is not null, and the length of license is greater than 0
		// create a new instance of the Car class from the values submitted
		if (license != null && license.length() > 0) {
			Car car;
			car = new Car(license, state, color, make, model);
			car.setLot(carLot);
			carLot.addCar(car);
			carRepo.save(car);
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}

	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCar(carIndex);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}

}

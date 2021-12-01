package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import web.service.CarService;

@Controller
public class CarsController {

	private final CarService carService;

	public CarsController(CarService carService) {
		this.carService = carService;
	}

    @GetMapping(value = "/cars")
	public ModelAndView getPrintCars(@RequestParam(required = false) Integer count) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("cars", carService.getCarsByCount(count));
		modelAndView.setViewName("cars");
		return modelAndView;
	}
}
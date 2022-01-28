package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.sql.rowset.CachedRowSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String getCars(ModelMap model,
						  @RequestParam(defaultValue = "5") int count){
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Honda", "Civic", 120));
		cars.add(new Car("Renault", "logan", 75));
		cars.add(new Car("Kia", "Rio", 98));
		cars.add(new Car("Volvo", "S40", 125));
		cars.add(new Car("MB", "e250", 225));
		System.out.println(count);
		if(count > 5 ) count = 5;
		model.addAttribute("cars", cars.subList(0, count));
		return "cars";
	}
	
}
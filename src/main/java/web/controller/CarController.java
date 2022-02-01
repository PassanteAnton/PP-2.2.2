package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService;

    @GetMapping()
    public String getCars(ModelMap model,
                          @RequestParam(defaultValue = "5") int count){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", "Civic", 120));
        cars.add(new Car("Renault", "logan", 75));
        cars.add(new Car("Kia", "Rio", 98));
        cars.add(new Car("Volvo", "S40", 125));
        cars.add(new Car("MB", "e250", 225));

        model.addAttribute("cars", carService.getCars(cars,count));
        return "cars";
    }

    public CarController(CarService carService) {
        this.carService = carService;
    }
}

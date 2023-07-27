package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {



    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count",required = false) Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Blue","250"));
        cars.add(new Car("Toyta", "Green","150"));
        cars.add(new Car("BMW", "White","180"));
        cars.add(new Car("Bugatti", "Blue","400"));
        cars.add(new Car("Reno", "Red","330"));
        model.addAttribute("cars", new CarServiceImpl().getCars(count,cars));
        //model.addAttribute(cars);
        return "cars";
    }
}

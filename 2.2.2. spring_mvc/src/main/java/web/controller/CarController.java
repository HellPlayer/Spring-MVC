package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsNumberExtractor;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "Red", 200));
        carList.add(new Car("BMW", "Blue", 150));
        carList.add(new Car("Mersedes", "Red", 250));
        carList.add(new Car("Mersedes", "Black", 300));
        carList.add(new Car("Tesla", "White", 300));
        CarsNumberExtractor extractor = new CarsNumberExtractor();
        List<Car> resultList = extractor.carsCount(carList, count);
        model.addAttribute("cars", resultList);
        return "cars";
    }
}

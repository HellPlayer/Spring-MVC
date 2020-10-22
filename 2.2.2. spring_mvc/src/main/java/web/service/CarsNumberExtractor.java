package web.service;

import web.model.Car;

import java.util.List;

public class CarsNumberExtractor {

    public List<Car> carsCount(List<Car> carList, int count) {
        if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}

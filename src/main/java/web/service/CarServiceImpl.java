package web.service;




import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Blue", "250"));
        cars.add(new Car("Toyta", "Green", "150"));
        cars.add(new Car("BMW", "White", "180"));
        cars.add(new Car("Bugatti", "Blue", "400"));
        cars.add(new Car("Reno", "Red", "330"));
    }

    @Override
    public List<Car> getCars(Integer count, List<Car> cars) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}




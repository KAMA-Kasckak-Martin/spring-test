package com.example.springtest.Repository;

import java.util.List;
import com.example.springtest.models.Car;

public class CarRepository {
    private List<Car> cars;

    public CarRepository(List<Car> car) {
        this.cars = car;
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car addCar(Car car){
        boolean add = this.cars.add(car);
        return car;

    }
}

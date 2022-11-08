package com.example.springtest.Repository;

import com.example.springtest.models.Car;

import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService(List<Car> car) {
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

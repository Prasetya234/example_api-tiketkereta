package com.example.demo.service;

import com.example.demo.model.Car;

import java.util.List;
import java.util.Map;

public interface CarService {
    Car create(Car car);
    Car update(int id, Car car);
    List<Car> findAll();
    Car delete(int id);
}

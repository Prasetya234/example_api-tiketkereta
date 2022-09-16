package com.example.demo.serviceImpl;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car create(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car update(int id, Car car) {
        Car update = carRepository.findById(id).get();
        update.setName(car.getName());
        update.setColor(car.getColor());
        update.setPrice(car.getPrice());
        return carRepository.save(update);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAllByDeletedIsFalse();
    }

    @Override
    public Car delete(int id) {
        Car delete = carRepository.findById(id).get();
        delete.setDeleted(true);
        return carRepository.save(delete);
    }
}

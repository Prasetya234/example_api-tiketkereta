package com.example.demo.controller;

import com.example.demo.dto.CarDTO;
import com.example.demo.model.Car;
import com.example.demo.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public Car tambah(@RequestBody CarDTO car) {
        return modelMapper.map(car, Car.class);
    }

    @GetMapping
    public List<Car> findAll() {
        return carService.findAll();
    }

    @PutMapping("/{id}")
    public Car update(@PathVariable("id") int id, @RequestBody Car car) {
        return carService.update(id, car);
    }

    @DeleteMapping("/{id}")
    public Car delete(@PathVariable("id") int id) {
        return carService.delete(id);
    }
}

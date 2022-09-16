package com.example.demo.controller;

import com.example.demo.model.PassagerType;
import com.example.demo.service.PassagerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passager-type")
public class PassagetTypeController {
    @Autowired
    private PassagerTypeService passagerTypeService;

    @PostMapping
    public PassagerType create(@RequestBody PassagerType passagerType) {
        return passagerTypeService.create(passagerType);
    }

    @GetMapping
    public List<PassagerType> findAll() {
        return passagerTypeService.findAll();
    }
}

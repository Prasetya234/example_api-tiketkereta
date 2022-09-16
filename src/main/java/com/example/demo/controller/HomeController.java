package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/demo-map")
    public User addCar(@RequestBody UserDTO userDto) {
        return modelMapper.map(userDto, User.class);
    }

    public String ajkdks() {
        return "dsjdfk";
    }
}

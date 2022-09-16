package com.example.demo.service;

import com.example.demo.model.PassagerType;

import java.util.List;

public interface PassagerTypeService {
    PassagerType create(PassagerType passagerType);
    List<PassagerType> findAll();
}

package com.example.demo.serviceImpl;

import com.example.demo.model.PassagerType;
import com.example.demo.repository.PassangerTypeRepository;
import com.example.demo.service.PassagerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassagerTypeServiceImpl implements PassagerTypeService {

    @Autowired
    private PassangerTypeRepository passangerTypeRepository;

    @Override
    public PassagerType create(PassagerType passagerType) {
        return passangerTypeRepository.save(passagerType);
    }

    @Override
    public List<PassagerType> findAll() {
        return passangerTypeRepository.findAll();
    }
}

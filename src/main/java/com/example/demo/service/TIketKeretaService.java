package com.example.demo.service;

import com.example.demo.dto.TiketKeretaDTO;
import com.example.demo.model.TiketKereta;

import java.util.List;

public interface TIketKeretaService {
    TiketKereta create(int passagerTypeId,  TiketKeretaDTO tiketKereta);
    List<TiketKereta> findAll();
    TiketKereta findById(int id);
}

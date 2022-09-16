package com.example.demo.controller;

import com.example.demo.dto.TiketKeretaDTO;
import com.example.demo.model.TiketKereta;
import com.example.demo.service.TIketKeretaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiket-kereta")
public class TiketKeretaController {
    @Autowired
    private TIketKeretaService tIketKeretaService;

    @PostMapping("/{passagerTypeId}")
    public TiketKereta create(@PathVariable("passagerTypeId") int passagerTypeId, @RequestBody TiketKeretaDTO tiketKeretaDTO) {
        return tIketKeretaService.create(passagerTypeId, tiketKeretaDTO);
    }

    @GetMapping
    public List<TiketKereta> findAll() {
        return tIketKeretaService.findAll();
    }
}

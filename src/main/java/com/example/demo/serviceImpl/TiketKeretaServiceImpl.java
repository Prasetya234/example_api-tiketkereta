package com.example.demo.serviceImpl;

import com.example.demo.dto.TiketKeretaDTO;
import com.example.demo.model.TiketKereta;
import com.example.demo.repository.PassangerTypeRepository;
import com.example.demo.repository.TiketKeretaRepository;
import com.example.demo.service.TIketKeretaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class TiketKeretaServiceImpl implements TIketKeretaService {

    private static final int LIMIT = 12;

    private ModelMapper modelMapper;
    private PassangerTypeRepository passangerTypeRepository;
    private TiketKeretaRepository tiketKeretaRepository;

    @Autowired
    public TiketKeretaServiceImpl(ModelMapper modelMapper, PassangerTypeRepository passangerTypeRepository, TiketKeretaRepository tiketKeretaRepository) {
        this.modelMapper= modelMapper;
        this.passangerTypeRepository = passangerTypeRepository;
        this.tiketKeretaRepository = tiketKeretaRepository;
    }

    @Override
    public TiketKereta create(int passagerTypeId, TiketKeretaDTO tiketKeretaDTO) {
        TiketKereta create = modelMapper.map(tiketKeretaDTO, TiketKereta.class);
        create.setPassagerType(passangerTypeRepository.findById(passagerTypeId).get());
        create.setKodeBoking(random());
        create.setEndDate(new Date(System.currentTimeMillis() + 7200000));
        return tiketKeretaRepository.save(create);
    }

    @Override
    public List<TiketKereta> findAll() {
        return tiketKeretaRepository.findAll();
    }

    @Override
    public TiketKereta findById(int id) {
        return tiketKeretaRepository.findById(id).get();
    }

    private String random() {
        String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+}{:";
        StringBuffer str = new StringBuffer();
        Random rdm = new Random();
        for (int i = 0; i <LIMIT; i++) {
            int idx = (int) (rdm.nextFloat() * code.length());
            str.append(code.charAt(idx));
        }
        return str.toString();
    }
}

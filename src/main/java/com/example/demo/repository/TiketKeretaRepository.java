package com.example.demo.repository;

import com.example.demo.model.TiketKereta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiketKeretaRepository extends JpaRepository<TiketKereta, Integer> {
}

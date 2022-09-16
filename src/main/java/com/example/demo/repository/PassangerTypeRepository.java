package com.example.demo.repository;

import com.example.demo.model.PassagerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassangerTypeRepository extends JpaRepository<PassagerType, Integer> {
}

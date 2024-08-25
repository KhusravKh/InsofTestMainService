package com.example.insoftestmainservice.repositories;

import com.example.insoftestmainservice.models.MousePositions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MousePositionsRespository extends JpaRepository<MousePositions, Long> {
}

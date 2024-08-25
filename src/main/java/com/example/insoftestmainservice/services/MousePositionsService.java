package com.example.insoftestmainservice.services;

import com.example.insoftestmainservice.models.MousePositions;
import com.example.insoftestmainservice.repositories.MousePositionsRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MousePositionsService {

    private final MousePositionsRespository mousePositionsRespository;

    public List<MousePositions> save(MousePositions mousePositions) {
        mousePositionsRespository.save(mousePositions);
        return mousePositionsRespository.findAll();
    }

    public List<MousePositions> findAll() {
        return mousePositionsRespository.findAll();
    }
}

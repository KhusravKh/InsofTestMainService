package com.example.insoftestmainservice.controllers;

import com.example.insoftestmainservice.dto.CodeDto;
import com.example.insoftestmainservice.models.User;
import com.example.insoftestmainservice.services.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CodeController {


    private final UserDetailsServiceImpl userDetailsService;

    @PostMapping("/code_save")
    public List<CodeDto> saveCode(@RequestBody CodeDto codeDto) {
        return userDetailsService.save(codeDto);
    }

    @GetMapping("/get_codes")
    public List<CodeDto> findAll() {
        return userDetailsService.findAll();
    }
}

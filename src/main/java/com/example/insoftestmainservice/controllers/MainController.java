package com.example.insoftestmainservice.controllers;

import com.example.insoftestmainservice.dto.CodeDto;
import com.example.insoftestmainservice.models.MousePositions;
import com.example.insoftestmainservice.models.User;
import com.example.insoftestmainservice.services.MousePositionsService;
import com.example.insoftestmainservice.services.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MousePositionsService mousePositionsService;

    @GetMapping("/")
    public String first(Model model) {
        var mousePositions = mousePositionsService.findAll();
        model.addAttribute("mousePositions", mousePositions);
        return "main";
    }

    @GetMapping("/mouse/{x}/{y}")
    public String main(Model model, @PathVariable("x") Integer x, @PathVariable("y") Integer y) {
        var mousePositions = mousePositionsService.save(new MousePositions(x, y));
        model.addAttribute("mousePositions", mousePositions);
        return "main";
    }

}

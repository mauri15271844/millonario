package com.millones.controller;


import com.millones.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteController {
    @Autowired
    private EstudianteService service;

    @GetMapping("/")
    public String soyMillonario(){
        return "index";
    }

    @GetMapping("/new")
    public String crear_millonarios(){
        return "crear_millonarios";
    }
}

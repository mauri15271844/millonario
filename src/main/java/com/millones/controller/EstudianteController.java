package com.millones.controller;


import com.millones.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EstudianteController {
    @Autowired
    private EstudianteService service;
}

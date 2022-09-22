package com.millones.service;

import com.millones.entity.Estudiante;
import com.millones.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public List<Estudiante> verEstudiantes(){
        return repository.findAll();
    }

    public void crear_estudiante(Estudiante nuevo_estudiante){
        repository.save(nuevo_estudiante);
    }

}

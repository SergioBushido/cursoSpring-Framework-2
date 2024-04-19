package com.example.tarea2cursospring.controllers;

import com.example.tarea2cursospring.services.SaludoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    SaludoServicio saludoServicio;

    public String sayHello(){
        return saludoServicio.diHola();
    }
}

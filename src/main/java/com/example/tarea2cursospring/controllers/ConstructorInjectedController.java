package com.example.tarea2cursospring.controllers;

import com.example.tarea2cursospring.services.SaludoServicio;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final SaludoServicio saludoServicio;

    public ConstructorInjectedController(SaludoServicio saludoServicio) {
        this.saludoServicio = saludoServicio;
    }

    public String sayHello(){
        return saludoServicio.diHola();
    }
}

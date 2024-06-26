package com.example.tarea2cursospring.controllers;

import com.example.tarea2cursospring.services.SaludoServicio;
import com.example.tarea2cursospring.services.SaludoServicioImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final SaludoServicio saludoServicio;

    public MyController() {
        this.saludoServicio = new SaludoServicioImpl();
    }

    public String diHola(){
        System.out.println("Soy el controlador");
        return saludoServicio.diHola();
    }
}

package com.example.tarea2cursospring.controllers;

import com.example.tarea2cursospring.services.SaludoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private SaludoServicio saludoServicio;

    @Autowired
    //inyeccion de dependencias por setter, por eso es void
    public void setSaludoServicio(SaludoServicio saludoServicio) {
        this.saludoServicio = saludoServicio;
    }
    public String sayHello(){
        return saludoServicio.diHola();
    }
}

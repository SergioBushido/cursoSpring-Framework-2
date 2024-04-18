package com.example.tarea2cursospring.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String diHola(){
        System.out.println("Soy el controlador");
        return "hola a todos";
    }
}

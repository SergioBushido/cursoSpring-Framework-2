package com.example.tarea2cursospring.controllers;

import com.example.tarea2cursospring.services.SaludoServicioImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new SaludoServicioImpl());

    }

    @Test
    void sayHello(){
        System.out.println(controller.sayHello());
    }
}
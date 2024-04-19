package com.example.tarea2cursospring.controllers;

import com.example.tarea2cursospring.services.SaludoServicio;
import com.example.tarea2cursospring.services.SaludoServicioImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setSaludoServicio(new SaludoServicioImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}
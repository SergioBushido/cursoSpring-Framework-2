package com.example.tarea2cursospring.services;

import org.springframework.stereotype.Service;

@Service
public class SaludoServicioImpl implements SaludoServicio {
    @Override
    public String diHola() {
        return "Hola desde el servicio";
    }
}

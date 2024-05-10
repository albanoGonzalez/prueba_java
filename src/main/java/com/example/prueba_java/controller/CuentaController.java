package com.example.prueba_java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba_java.model.CuentaModel;
import com.example.prueba_java.repository.CuentaRepository;

import java.util.List;

@RestController
public class CuentaController {
    @Autowired
    private CuentaRepository cuentaRepository;

    @GetMapping("/cuenta")
    public List<CuentaModel> obtenerTodasLasCuentas() {
        return cuentaRepository.findAll();
    }

    @GetMapping("/cuenta/{id}")
    public CuentaModel obtenerCuentaPorId(@PathVariable String id) {
        return cuentaRepository.findById(id).orElse(null);
    }
    
    @GetMapping("/cuenta/{id}/existe")
    public boolean existeCuenta(@PathVariable String id){
        return cuentaRepository.existsById(id);
    }
}

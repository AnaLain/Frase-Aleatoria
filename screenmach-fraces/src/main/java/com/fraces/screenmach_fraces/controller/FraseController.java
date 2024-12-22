package com.fraces.screenmach_fraces.controller;

import com.fraces.screenmach_fraces.dto.FraseDTO;
import com.fraces.screenmach_fraces.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FraseController {
    @Autowired
    FraseService servicio;

    @GetMapping("/series/frases")
    public FraseDTO obteerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();


    }
}

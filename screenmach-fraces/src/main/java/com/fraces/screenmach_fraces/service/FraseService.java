package com.fraces.screenmach_fraces.service;

import com.fraces.screenmach_fraces.dto.FraseDTO;
import com.fraces.screenmach_fraces.model.Frase;
import com.fraces.screenmach_fraces.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria(){
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}

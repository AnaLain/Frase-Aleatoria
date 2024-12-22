package com.fraces.screenmach_fraces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fraces.screenmach_fraces.model.Frase;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long>{

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();
}

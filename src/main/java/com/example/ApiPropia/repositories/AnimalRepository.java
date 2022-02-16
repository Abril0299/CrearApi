package com.example.ApiPropia.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.ApiPropia.models.Animal;
import java.util.List;

@Repository
public interface AnimalRepository extends CrudRepository<Animal,Long>{
    @Query(value = "select * from animal an where an.nombre like %:keyword% or an.especie like %:keyword%", nativeQuery = true)
    List<Animal> EncontrarPorPalabra(@Param("keyword") String keyword);
    
}



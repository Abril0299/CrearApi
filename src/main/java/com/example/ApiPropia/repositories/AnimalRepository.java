package com.example.ApiPropia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ApiPropia.models.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal,Long>{
    
}

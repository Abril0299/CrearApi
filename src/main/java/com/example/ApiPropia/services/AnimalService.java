package com.example.ApiPropia.services;

import com.example.ApiPropia.models.Animal;
import com.example.ApiPropia.repositories.AnimalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired 
    AnimalRepository AnimalRepo; 


    
    public ArrayList<Animal> TodoslosAnimales(){
       
        return (ArrayList<Animal>) AnimalRepo.findAll();
   }



   public String guardar(Animal animal){
       AnimalRepo.save(animal);
       return "guardado correctamente";
   }


   public Optional<Animal> Obtenerid(Long id){
        return AnimalRepo.findById(id);
    }

}

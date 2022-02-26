package com.example.ApiPropia.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiPropia.models.Animal;
import com.example.ApiPropia.services.AnimalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController 
@RequestMapping("/animales") //RUTA DONDE VAMOS A LLAMAR
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class AnimalController {
    @Autowired
    AnimalService animalService;


    
        
    //GET
    @GetMapping()
    public ArrayList<Animal> obtenerAnimales(){
        return animalService.TodoslosAnimales();
    }

    @PostMapping()
    public String guardar(@RequestBody Animal animal){
        return animalService.guardar(animal);
    }

    @GetMapping("/{id}")
    public Optional<Animal> ObtenerAnimalId(@PathVariable("id") Long id){
        return animalService.Obtenerid(id);
    }

    @PostMapping("search")
    public List<Animal> BuscarAnimal(@RequestParam("query") String query){
        var nombre = animalService.Buscarporpalabra(query);
        System.out.println(nombre);
        return nombre;

    }
}


    
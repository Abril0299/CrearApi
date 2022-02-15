package com.example.ApiPropia.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiPropia.models.Animal;
import com.example.ApiPropia.services.AnimalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/animales") //RUTA DONDE VAMOS A LLAMAR
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


    
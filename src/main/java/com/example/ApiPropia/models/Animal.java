package com.example.ApiPropia.models;

import javax.persistence.*;

@Entity
@Table(name="Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    
    private Long id;
    private String nombreC;
    private String especie;
    private String color;
    
    
//Nombre  Cientifico    
    public String getNombreCientifico() {
        return nombreC;
    }
    public void setNombreCientifico(String nombreC) {
        this.nombreC = nombreC;
    }
//Especie 
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

//Especie 
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}



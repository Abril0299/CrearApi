package com.example.ApiPropia.models;

import javax.persistence.*;

@Entity
@Table(name="Animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    
    private Long id;
    private String nombre_comun;
    private String especie;
    private String color;
    
    
//Nombre  Cientifico    
    public String getNombreComun() {
        return nombre_comun;
    }
    public void setNombreComun(String nombre_comun) {
        this.nombre_comun= nombre_comun;
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



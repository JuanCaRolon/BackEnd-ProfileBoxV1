/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Juan Carlos Rolon
 */
@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prof_persona")
    private Profile profPersona;
    
    private String tipo;
    private String descripcion;
    
    //*** Constructores ***
    public Habilidad() {
    }

    public Habilidad(Long id, Profile profPersona, String tipo, String descripcion) {
        this.id = id;
        this.profPersona = profPersona;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    
    //*** Getters y Setters ***        
    public Long getId() {
        return id;
    }
    
    public Long getProfPersona() {
        return profPersona.getId();
    }

    public void setProfPersona(Profile profPersona) {
        this.profPersona = profPersona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

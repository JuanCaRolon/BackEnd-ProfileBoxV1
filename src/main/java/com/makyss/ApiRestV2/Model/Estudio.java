/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Model;

import java.time.LocalDate;
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
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prof_persona")
    private Profile profPersona;
        
    private Boolean finalizado;
    private LocalDate inicio;
    private LocalDate fin;
    private String nivel;
    private String carrera;
    private String institucion;
    
    //*** Constructores ***
    public Estudio() {
    }

    public Estudio(Long id, Profile profPersona, Boolean finalizado, LocalDate inicio, LocalDate fin, String nivel, String carrera, String institucion) {
        this.id = id;
        this.profPersona = profPersona;
        this.finalizado = finalizado;
        this.inicio = inicio;
        this.fin = fin;
        this.nivel = nivel;
        this.carrera = carrera;
        this.institucion = institucion;
    }
    
    //*** Getters y Setters ***
    public Long getId() {
        return id;
    }
    
    public Long getProfPersona() {
        return profPersona.getId();
    }

    /*public void setProfPersona(Profile profPersona) {    
        this.profPersona = profPersona;
    }*/

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Model;

import java.time.LocalDate;
import javax.persistence.Entity;
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
public class Laboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_prof_persona")
    private Profile profPersona;
    
    private String empresa;
    private LocalDate ingreso;
    private LocalDate egreso;
    private String actividad;
    
    //*** Constructores ***
    public Laboral() {
    }

    public Laboral(Long id, Profile profPersona, String empresa, LocalDate ingreso, LocalDate egreso, String actividad) {
        this.id = id;
        this.profPersona = profPersona;
        this.empresa = empresa;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.actividad = actividad;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public LocalDate getEgreso() {
        return egreso;
    }

    public void setEgreso(LocalDate egreso) {
        this.egreso = egreso;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}

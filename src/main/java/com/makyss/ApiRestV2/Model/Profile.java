/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Juan Carlos Rolon
 */
@Entity
public class Profile {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    private Persona persona;
    
    @OneToMany(mappedBy = "profPersona")
    private List<Estudio> estudios = new ArrayList<>();
    
    @OneToMany(mappedBy = "profPersona", cascade = CascadeType.ALL)
    private List<Capacitacion> capacitaciones = new ArrayList<>();
    
    @OneToMany(mappedBy = "profPersona", cascade = CascadeType.ALL)
    private List<Laboral> laborales = new ArrayList<>();

    @OneToMany(mappedBy = "profPersona", cascade = CascadeType.ALL)
    private List<Habilidad> habilidades = new ArrayList<>();
    
    //*** Constructores ***    
    public Profile() {
    }
    
    public Profile(Long id, Persona persona) {
        this.id = id;
        this.persona = persona;
    }
    
    //*** Getters y Setters ***    
    public Long getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Estudio> getEstudios() {
        return estudios;
    }

    public void setEstudios(List<Estudio> estudios) {
        this.estudios = estudios;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public List<Laboral> getLaborales() {
        return laborales;
    }

    public void setLaborales(List<Laboral> laborales) {
        this.laborales = laborales;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
    
}

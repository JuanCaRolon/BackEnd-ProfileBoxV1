/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Model;

//import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Juan Carlos Rolon
 */
@Entity
public class Domicilio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String calle;
    private String numero;
    private String ciudad;
    private String pais;

    public Domicilio() {
    }

    //*** Constructores ***
    public Domicilio(String calle, String numero) {
    }

    public Domicilio(String calle, String numero, String ciudad, String pais) {
        //this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    
    //*** Getters y Setters *** 
    public Long getId() {
        return id;
    }
     
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

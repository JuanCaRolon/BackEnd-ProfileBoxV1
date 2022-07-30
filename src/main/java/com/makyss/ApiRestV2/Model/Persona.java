/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Model;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Juan Carlos Rolon
 */
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String apellido;
    private String nombres;
    private LocalDate fechaNacimiento;
    private String lugarNacimiento;
    private String dni;
    private String cuit;
    private String estadoCivil;
    private int cantidadHijos;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_domicilio", referencedColumnName = "id")
    private Domicilio domicilio;
    
    private String email;
    private String foto;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_telefono", referencedColumnName = "id")
    private Telefono telefono;

    //*** Constructores ***
    public Persona() {
    }

    public Persona(String apellido, String nombres) {
        this.apellido = apellido;
        this.nombres = nombres;
    }

    public Persona(String apellido, String nombres, LocalDate fechaNacimiento, String lugarNacimiento, String dni, String cuit, String estadoCivil, int cantidadHijos, Domicilio domicilio, String email, String foto, Telefono telefono) {
        //this.id = id;
        this.apellido = apellido;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.dni = dni;
        this.cuit = cuit;
        this.estadoCivil = estadoCivil;
        this.cantidadHijos = cantidadHijos;
        this.domicilio = domicilio;
        this.email = email;
        this.foto = foto;
        this.telefono = telefono;
    }
    
    //*** Getters y Setters ***
    public Long getId() {
        return id;
    }
    
    public String getApellidoNombres() {
        return apellido+", "+nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    
}

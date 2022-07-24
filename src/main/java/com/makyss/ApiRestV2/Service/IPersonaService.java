/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Persona;
import java.util.List;

/**
 *
 * @author Juan Carlos Rolon
 */
public interface IPersonaService {
    
    public Persona altaPersona(Persona persona);
    public void bajaPersona(Long id);
    public void modifPersona(Persona persona);
    public Persona buscaPersona(Long id);
    public List<Persona> listaPersonas();
}

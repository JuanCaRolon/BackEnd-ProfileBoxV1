/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Telefono;
import java.util.List;

/**
 *
 * @author Juan Carlos Rolon
 */
public interface ITelefonoService {
    
    public void altaTelefono(Telefono telefono);
    public void bajaTelefono(Long id);
    public Telefono buscaTelefono(Long id);
    public List<Telefono> listaTelefono();
    
}

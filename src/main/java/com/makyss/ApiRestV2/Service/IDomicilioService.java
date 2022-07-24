/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Domicilio;
import java.util.List;

/**
 *
 * @author Juan Carlos Rolon
 */
public interface IDomicilioService {
    
    public void altaDomicilio(Domicilio domicilio);
    public void bajaDomicilio(Long id);
    public Domicilio buscaDomicilio(Long id);
    public List<Domicilio> listaDomicilio();
}

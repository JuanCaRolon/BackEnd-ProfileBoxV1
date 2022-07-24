/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Capacitacion;
import com.makyss.ApiRestV2.Model.Profile;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public interface ICapacitacionService {
    
    public void altaCapacitacion(Capacitacion capacitacion);
    public void bajaCapacitacion(Long id);
    public void modificacionCapacitacion(Capacitacion capacitacion);
    public Capacitacion buscaCapacitacion(Long id);
    public List<Capacitacion> listaCapacitacion();
    public List<Capacitacion> listaCapacitacionProf(Profile profPersona);
    
}

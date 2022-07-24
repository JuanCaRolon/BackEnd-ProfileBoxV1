/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Habilidad;
import com.makyss.ApiRestV2.Model.Profile;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public interface IHabilidadService {
    
    public void altaHabilidad(Habilidad habilidad);
    public void bajaHabilidad(Long id);
    public void modificacionHabilidad(Habilidad habilidad);
    public Habilidad buscaHabilidad(Long id);
    public List<Habilidad> listaHabilidad();
    public List<Habilidad> listaHabilidadProf(Profile profPersona);
    
}

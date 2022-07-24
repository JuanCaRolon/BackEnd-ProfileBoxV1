/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Laboral;
import com.makyss.ApiRestV2.Model.Profile;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public interface ILaboralService {
    
    public void altaLaboral(Laboral laboral);
    public void bajaLaboral(Long id);
    public Laboral buscaLaboral(Long id);
    public void modificacionLaboral(Laboral laboral);
    public List<Laboral> listaLaboral();
    public List<Laboral> listaLaboralProf(Profile profPersona);
    
}

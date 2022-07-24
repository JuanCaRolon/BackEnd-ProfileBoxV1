/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Habilidad;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Repository.IHabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class HabilidadService implements IHabilidadService{
    
    @Autowired
    private IHabilidadRepository habilRepo;
    
     @Override
    public void altaHabilidad(Habilidad habilidad) {
        habilRepo.save(habilidad);
    }

    @Override
    public void bajaHabilidad(Long id) {
        habilRepo.deleteById(id);
    }
    
    @Override
    public void modificacionHabilidad(Habilidad habilidad) {
        Habilidad habil = this.buscaHabilidad(habilidad.getId());
        if (habil != null){
            habilRepo.save(habilidad);
        }
    }
    
    @Override
    public Habilidad buscaHabilidad(Long id) {
        return habilRepo.findById(id).orElse(null);
    }

    @Override
    public List<Habilidad> listaHabilidad() {
        return habilRepo.findAll();
    }
    
    @Override
    public List<Habilidad> listaHabilidadProf(Profile profPersona) {
        return habilRepo.findByprofPersona(profPersona);
    }

}

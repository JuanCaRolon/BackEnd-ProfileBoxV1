/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Capacitacion;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Repository.ICapacitacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class CapacitacionService implements ICapacitacionService{
    
    @Autowired
    private ICapacitacionRepository capaRepo;

    @Override
    public void altaCapacitacion(Capacitacion capacitacion) {
        capaRepo.save(capacitacion);
    }

    @Override
    public void bajaCapacitacion(Long id) {
        capaRepo.deleteById(id);
    }

    @Override
    public Capacitacion buscaCapacitacion(Long id) {
        return capaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Capacitacion> listaCapacitacion() {
        return capaRepo.findAll();
    }

    @Override
    public void modificacionCapacitacion(Capacitacion capacitacion) {
        Capacitacion capa = this.buscaCapacitacion(capacitacion.getId());
        if (capa != null){
            capaRepo.save(capacitacion);
        }
    }

    @Override
    public List<Capacitacion> listaCapacitacionProf(Profile profPersona) {
        return capaRepo.findByprofPersona(profPersona);
    }
        
}

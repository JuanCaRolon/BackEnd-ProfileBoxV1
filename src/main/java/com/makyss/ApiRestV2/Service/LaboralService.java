/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Laboral;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Repository.ILaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class LaboralService implements ILaboralService{
    
    @Autowired
    private ILaboralRepository laboRepo;
    
    @Override
    public void altaLaboral(Laboral laboral) {
        laboRepo.save(laboral);
    }

    @Override
    public void bajaLaboral(Long id) {
        laboRepo.deleteById(id);
    }
    
    @Override
    public void modificacionLaboral(Laboral laboral) {
        Laboral labo = this.buscaLaboral(laboral.getId());
        if (labo != null){
            laboRepo.save(laboral);
        }
    }

    @Override
    public Laboral buscaLaboral(Long id) {
        return laboRepo.findById(id).orElse(null);
    }

    @Override
    public List<Laboral> listaLaboral() {
        return laboRepo.findAll();
    }

    @Override
    public List<Laboral> listaLaboralProf(Profile profPersona) {
        return laboRepo.findByprofPersona(profPersona);
    }
    
}

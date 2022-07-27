/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Estudio;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Repository.IEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class EstudioService implements IEstudioService{
    
    @Autowired
    private IEstudioRepository estuRepo;
    
    @Override
    public void altaEstudio(Estudio estudio) {
        estuRepo.save(estudio);
    }

    @Override
    public void bajaEstudio(Long id) {
        estuRepo.deleteById(id);
    }

    @Override
    public Estudio buscaEstudio(Long id) {
        return estuRepo.findById(id).orElse(null);
    }

    @Override
    public List<Estudio> listaEstudio() {
        return estuRepo.findAll();
    }

    @Override
    public List<Estudio> listaEstudioProf(Profile profPersona) {
        return estuRepo.findByprofPersona(profPersona);
    }

    @Override
    public void modificacionEstudio(Estudio estudio) {
        Estudio estu = this.buscaEstudio(estudio.getId());
        if (estu != null){
            estuRepo.save(estudio);
        }
    }

    @Override
    public Estudio buscaEstudioNivel(String nivel) {
        return estuRepo.findOneByNivel(nivel);
    }
        
}

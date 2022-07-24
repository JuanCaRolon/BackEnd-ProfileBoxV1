/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Persona;
import com.makyss.ApiRestV2.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private IPersonaRepository persoRepo;
    
    @Override
    public Persona altaPersona(Persona persona) {
        return persoRepo.save(persona);
    }

    @Override
    public void bajaPersona(Long id) {
        persoRepo.deleteById(id);
    }
    
   @Override
    public void modifPersona(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public Persona buscaPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Persona> listaPersonas() {
        return persoRepo.findAll();
    }

    
    
}

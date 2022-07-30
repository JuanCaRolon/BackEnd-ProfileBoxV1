/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

//import com.makyss.ApiRestV2.Model.Persona;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Repository.IProfileRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class ProfileService implements IProfileService{
    
    @Autowired
    private IProfileRepository profRepo;
    //private IPersonaRepository persoRepo;
    
    @Override
    public void altaProfile(Profile profile) {
        profRepo.save(profile);
    }

    @Override
    public void bajaProfile(Long id) {
        profRepo.deleteById(id);
    }

    @Override
    public Profile buscaProfile(Long id) {
        return profRepo.findById(id).orElse(null);
    }

    /*
    @Override
    public Profile buscaProfilePersona(Persona persona) {
        return profRepo.findOneByPersona(persona); 
    }
    
    @Override
    public Profile buscaProfileIdPersona(Long id) {
        //persoRepo.findById(id);
        //return profRepo.findOneByPersona(id_persona);
        return profRepo.findOneByid_persona(id); 
    }
    */

    @Override
    public List<Profile> listaProile() {
        return profRepo.findAll();
    }

        
}

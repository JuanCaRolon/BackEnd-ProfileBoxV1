/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

//import com.makyss.ApiRestV2.Model.Persona;
import com.makyss.ApiRestV2.Model.Profile;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public interface IProfileService {
    
    public void altaProfile(Profile profile);
    public void bajaProfile(Long id);
    public Profile buscaProfile(Long id);
    //public Profile buscaProfileIdPersona(Long id);
    //public Profile buscaProfilePersona(Persona persona);
        
    public List<Profile> listaProile();
    
}

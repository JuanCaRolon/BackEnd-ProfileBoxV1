/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Service.IProfileService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan Carlos Rolon
 */
@RestController
public class ProfileController {
    
    @Autowired
    private IProfileService profContr;
    
    @GetMapping("/profile/busca/{id}")
    public Profile buscaProfile(@PathVariable Long id){
        return profContr.buscaProfile(id);
    }
    
    @GetMapping("/profile/buscaxpersona/{id}")
    public Profile buscaProfilePersona(@PathVariable Long id){
        return profContr.buscaProfilePersona(id);
    }
    
    @GetMapping("/profile/lista")
    @ResponseBody
    public List<Profile> listaProfile(){
        return profContr.listaProfile();
    }
    
    @PostMapping("/profile/alta")
    public void altaProfile(@RequestBody Profile profile){
        profContr.altaProfile(profile);
    }
    
    @DeleteMapping("/profile/baja/{id}")
    public void bajaProfile(@PathVariable Long id){
        profContr.bajaProfile(id);
    }
   
}

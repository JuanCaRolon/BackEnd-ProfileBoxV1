/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Laboral;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Service.ILaboralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan Carlos Rolon
 */
@RestController
public class LaboralController {
    
    @Autowired
    private ILaboralService laboContr;
    
    @GetMapping("/laboral/lista")
    @ResponseBody
    public List<Laboral> listaLaboral(){
        return laboContr.listaLaboral();
    }
    
    @GetMapping("/laboral/lista/{profPersona}")
    @ResponseBody
    public List<Laboral> listaLaboralProf(@PathVariable Profile profPersona){
        return laboContr.listaLaboralProf(profPersona);
    }
    
    @PostMapping("/laboral/alta")
    public void altaLaboral(@RequestBody Laboral laboral){
        laboContr.altaLaboral(laboral);
    }
    
    @DeleteMapping("/laboral/baja/{id}")
    public void bajaLaboral(@PathVariable Long id){
        laboContr.bajaLaboral(id);
    }
    
    @PutMapping("/laboral/modif")
    public void modifLaboral(@RequestBody Laboral laboral){
        laboContr.modificacionLaboral(laboral);
    }
}

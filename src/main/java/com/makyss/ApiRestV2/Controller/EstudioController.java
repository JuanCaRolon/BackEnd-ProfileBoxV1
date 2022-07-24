/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Estudio;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Service.IEstudioService;
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
public class EstudioController {
    
    @Autowired
    private IEstudioService estuContr;
    
    @GetMapping("/estudio/lista")
    @ResponseBody
    public List<Estudio> listaEstudio(){
        return estuContr.listaEstudio();
    }
    
    @GetMapping("/estudio/lista/{profPersona}")
    @ResponseBody
    public List<Estudio> listaEstudioProf(@PathVariable Profile profPersona){
        return estuContr.listaEstudioProf(profPersona);
    }
    
    @PostMapping("/estudio/alta")
    public void altaEstudio(@RequestBody Estudio estudio){
        estuContr.altaEstudio(estudio);
    }
    
    @DeleteMapping("/estudio/baja/{id}")
    public void bajaEstudio(@PathVariable Long id){
        estuContr.bajaEstudio(id);
    }

    @PutMapping("/estudio/modificacion")
    public void modificacionEstudio(@RequestBody Estudio estudio){
        System.out.println("Modificando");
        estuContr.modificacionEstudio(estudio);
    }
    
}

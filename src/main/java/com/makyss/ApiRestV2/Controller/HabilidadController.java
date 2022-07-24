/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Habilidad;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Service.IHabilidadService;
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
public class HabilidadController {
    
    @Autowired
    private IHabilidadService habilContr;
    
    @GetMapping("/habilidad/busca/{id}")
    public Habilidad buscaHabilidad(@PathVariable Long id){
        return habilContr.buscaHabilidad(id);
    }
    
    @GetMapping("/habilidad/lista")
    @ResponseBody
    public List<Habilidad> listaHabilidad(){
        return habilContr.listaHabilidad();
    }
    
    @GetMapping("/habilidad/lista/{profPersona}")
    @ResponseBody
    public List<Habilidad> listaHabilidadProf(@PathVariable Profile profPersona){
        return habilContr.listaHabilidadProf(profPersona);
    }
    
    @PostMapping("/habilidad/alta")
    public void altaHabilidad(@RequestBody Habilidad habilidad){
        habilContr.altaHabilidad(habilidad);
    }
    
    @DeleteMapping("/habilidad/baja")
    public void bajaHabilidad(@PathVariable Long id){
        habilContr.bajaHabilidad(id);
    }
    
    @PutMapping("/habilidad/modificacion")
    public void modifHabilidad(@RequestBody Habilidad habilidad){
        habilContr.modificacionHabilidad(habilidad);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Capacitacion;
import com.makyss.ApiRestV2.Model.Profile;
import com.makyss.ApiRestV2.Service.ICapacitacionService;
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
public class CapacitacionController {
    
    @Autowired
    private ICapacitacionService capaContr;
    
    @GetMapping("/capacitacion/busca/{id}")
    public Capacitacion buscaCapacitacion(@PathVariable Long id){
        return capaContr.buscaCapacitacion(id);
    }
    
    @GetMapping("/capacitacion/lista")
    @ResponseBody
    public List<Capacitacion> listaCapacitacion(){
        return capaContr.listaCapacitacion();
    }
    
    @GetMapping("/capacitacion/lista/{profPersona}")
    @ResponseBody
    public List<Capacitacion> listaCapacitacionProf(@PathVariable Profile profPersona){
        return capaContr.listaCapacitacionProf(profPersona);
    }
    
    @PostMapping("/capacitacion/alta")
    public void altaCapacitacion(@RequestBody Capacitacion capacitacion){
        capaContr.altaCapacitacion(capacitacion);
    }
    
    @DeleteMapping("/capacitacion/baja/{id}")
    public void bajaCapacitacion(@PathVariable Long id){
        capaContr.bajaCapacitacion(id);
    }
    
    @PutMapping("/capacitacion/modificacion")
    public void modifCapacitacion(@RequestBody Capacitacion capacitacion){
        capaContr.modificacionCapacitacion(capacitacion);
    }

}

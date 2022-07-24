/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Persona;
import com.makyss.ApiRestV2.Service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoContr;
    
    @GetMapping("persona/lista")
    @ResponseBody
    public List<Persona> listaPersona(){
        System.out.println("Listando");
        return persoContr.listaPersonas();
    }
    
    @GetMapping("/persona/busca/{id}")
    public Persona buscaPersona(@PathVariable Long id){
        System.out.println("Buscado");
        return persoContr.buscaPersona(id);
    }
    
    @PostMapping("/persona/alta")
    public Persona altaPersona(@RequestBody Persona persona){
        return persoContr.altaPersona(persona);
    }
    
    @DeleteMapping("/persona/baja/{id}")
    public void bajaPersona(@PathVariable Long id){
        persoContr.bajaPersona(id);
    }
    
    @PutMapping("/persona/modificacion")
    public void modifPersona(@RequestBody Persona persona){
        System.out.println("Modificando");
        persoContr.modifPersona(persona);
    }
    
}

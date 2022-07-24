/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Domicilio;
import com.makyss.ApiRestV2.Service.IDomicilioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan Carlos Rolon
 */
@RestController
public class DomicilioController {
    
    @Autowired
    private IDomicilioService domiContr;
   
    @GetMapping("/domicilio/lista")
    @ResponseBody
    public List<Domicilio> listaDomicilio(){
        return domiContr.listaDomicilio();
    }
    
    @GetMapping("/domicilio/busca/{id}")
    public Domicilio buscaDomicilio(@PathVariable Long id){
        return domiContr.buscaDomicilio(id);
    }
        
}

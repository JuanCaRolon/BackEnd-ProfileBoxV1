/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Controller;

import com.makyss.ApiRestV2.Model.Telefono;
import com.makyss.ApiRestV2.Service.ITelefonoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan Carlos Rolon
 */
@RestController
public class TelefonoController {
    
    @Autowired
    private ITelefonoService teleContr;
    
    @GetMapping("/telefono/lista")
    @ResponseBody
    public List<Telefono> listaTelefono(){
        return teleContr.listaTelefono();
    }
    
}

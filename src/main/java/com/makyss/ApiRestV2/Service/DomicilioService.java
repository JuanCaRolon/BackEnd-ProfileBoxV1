/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Domicilio;
import com.makyss.ApiRestV2.Repository.IDomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class DomicilioService implements IDomicilioService{
    
    @Autowired
    private IDomicilioRepository domiRepo;
    
    @Override
    public void altaDomicilio(Domicilio domicilio) {
        domiRepo.save(domicilio);
    }

    @Override
    public void bajaDomicilio(Long id) {
        domiRepo.deleteById(id);
    }

    @Override
    public Domicilio buscaDomicilio(Long id) {
        return domiRepo.findById(id).orElse(null);
    }

    @Override
    public List<Domicilio> listaDomicilio() {
        return domiRepo.findAll();
    }
        
}

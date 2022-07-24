/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Telefono;
import com.makyss.ApiRestV2.Repository.ITelefonoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rolon
 */
@Service
public class TelefonoService implements ITelefonoService{
    
    @Autowired
    private ITelefonoRepository teleRepo;
    
    @Override
    public void altaTelefono(Telefono telefono) {
        teleRepo.save(telefono);
    }

    @Override
    public void bajaTelefono(Long id) {
        teleRepo.deleteById(id);
    }

    @Override
    public Telefono buscaTelefono(Long id) {
        return teleRepo.findById(id).orElse(null);
    }

    @Override
    public List<Telefono> listaTelefono() {
        return teleRepo.findAll();
    }
    
}

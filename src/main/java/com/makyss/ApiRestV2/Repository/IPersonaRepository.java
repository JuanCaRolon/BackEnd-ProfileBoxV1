/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Repository;

import com.makyss.ApiRestV2.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Carlos Rolon
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}

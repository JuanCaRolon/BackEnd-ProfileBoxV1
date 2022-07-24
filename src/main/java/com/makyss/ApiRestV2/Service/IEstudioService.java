/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.makyss.ApiRestV2.Service;

import com.makyss.ApiRestV2.Model.Estudio;
import com.makyss.ApiRestV2.Model.Profile;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Carlos Rlon
 */
@Service
public interface IEstudioService {
    
    public void altaEstudio(Estudio estudio);
    public void bajaEstudio(Long id);
    public void modificacionEstudio(Estudio estudio);
    public Estudio buscaEstudio(Long id);
    public List<Estudio> listaEstudio();
    public List<Estudio> listaEstudioProf(Profile profPersona);
    
}

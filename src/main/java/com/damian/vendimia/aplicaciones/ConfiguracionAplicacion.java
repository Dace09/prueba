package com.damian.vendimia.aplicaciones;

import com.damian.vendimia.Services.Validaciones;
import com.damian.vendimia.dominio.Configuracion;
import com.damian.vendimia.repositorio.ConfiguracionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by desarrollo on 12/03/18.
 */

@Service
public class ConfiguracionAplicacion {

    @Autowired
    private Validaciones validaciones;

    @Autowired
    private ConfiguracionRepositorio configuracionRepositorio;

    public Configuracion save(Configuracion configuracion) throws Exception {
        this.validaciones.validarNull(configuracion.getTasaFinanciamiento(),
                "Tasa financiamiento no debe ser null");
        this.validaciones.validarNull(configuracion.getEnganche(),
                "Enganche no debe ser null");
        this.validaciones.validarNull(configuracion.getPlazo(),
                "Plazo no debe ser null");

        configuracion = this.configuracionRepositorio.save(configuracion);
        if(configuracion == null){
            throw new Exception("Error al guardar los datos");
        }
        return configuracion;
    }

    public Configuracion getById(String id) throws Exception {
        Configuracion configuracion = this.configuracionRepositorio.findOne(id);
        if (configuracion == null){
            throw new Exception("El recurso no existe");
        }
        return configuracion;
    }

    public List<Configuracion> getAll(){
        return this.configuracionRepositorio.findAll();
    }
}

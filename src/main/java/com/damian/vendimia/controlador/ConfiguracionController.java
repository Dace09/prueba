package com.damian.vendimia.controlador;

import com.damian.vendimia.aplicaciones.ConfiguracionAplicacion;
import com.damian.vendimia.dominio.Configuracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by desarrollo on 12/03/18.
 */

@RestController
@RequestMapping(value = "api/configuracion")
public class ConfiguracionController {

    @Autowired
    private ConfiguracionAplicacion configuracionAplicacion;

    @PostMapping
    private Configuracion save(@RequestBody Configuracion configuracion) throws Exception {
        return this.configuracionAplicacion.save(configuracion);
    }

    @GetMapping("/")
    private List<Configuracion> getAll() {
        return this.configuracionAplicacion.getAll();
    }

    @GetMapping("/{id}")
    private Configuracion get(@PathVariable String id) throws Exception {
        return this.configuracionAplicacion.getById(id);
    }

    @PutMapping
    private Configuracion put(@RequestBody Configuracion configuracion) throws Exception {
        return this.configuracionAplicacion.save(configuracion);
    }
}

package com.damian.vendimia.repositorio;

import com.damian.vendimia.dominio.Configuracion;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by desarrollo on 9/03/18.
 */

public interface ConfiguracionRepositorio extends MongoRepository<Configuracion, String>{
}

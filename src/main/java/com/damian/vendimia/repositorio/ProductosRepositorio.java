package com.damian.vendimia.repositorio;

import com.damian.vendimia.dominio.Producto;
import org.springframework.data.repository.CrudRepository;

/*@RestResource(path = "api/productos")*/
public interface ProductosRepositorio extends CrudRepository <Producto, Integer> {
}

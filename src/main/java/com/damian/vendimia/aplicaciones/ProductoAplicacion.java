package com.damian.vendimia.aplicaciones;

import com.damian.vendimia.Services.Validaciones;
import com.damian.vendimia.dominio.Producto;
import com.damian.vendimia.repositorio.ProductosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoAplicacion {

    @Autowired
    private ProductosRepositorio productosRepositorio;

    @Autowired
    private Validaciones validaciones;

    public Producto save(Producto producto) throws Exception {
        this.validaciones.validarNull(producto.getClave(), "Ingrese la clave");
        this.validaciones.validarNull(producto.getExistencia(), "Ingrese la existencia");
        this.validaciones.validarNull(producto.getDescripcion(), "descripcion no debe ser null");
        this.validaciones.validarVacio(producto.getDescripcion(), "Ingrese la descripción");
        this.validaciones.validarVacio(producto.getModelo(), "Ingrese el modelo");
        this.validaciones.validarNull(producto.getPrecio(), "Ingrese el precio");
        producto =  this.productosRepositorio.save(producto);
        if (producto == null){
            throw new Exception("Error al guardar los datos");
        }
        return producto;
    }

    public Producto getById(Integer id) throws Exception {
        Producto producto =  this.productosRepositorio.findOne(id);
        if(producto == null){
            throw new Exception("No se encontro el producto");
        }
        return producto;
    }

    public Iterable<Producto> getAll(){
        return this.productosRepositorio.findAll();
    }
}

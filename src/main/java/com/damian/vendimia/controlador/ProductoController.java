package com.damian.vendimia.controlador;

import com.damian.vendimia.aplicaciones.ProductoAplicacion;
import com.damian.vendimia.dominio.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/producto")
public class ProductoController {

    @Autowired
    private ProductoAplicacion productoAplicacion;

    @PostMapping
    private Producto save(@RequestBody Producto producto) throws Exception {
        return this.productoAplicacion.save(producto);
    }

    @GetMapping("/{id}")
    private Producto get(@PathVariable Integer id) throws Exception {
        return this.productoAplicacion.getById(id);
    }

    @GetMapping
    private Iterable<Producto> getAll() {
        return this.productoAplicacion.getAll();
    }
}

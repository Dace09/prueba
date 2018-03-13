package com.damian.vendimia.dominio;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "articulo")
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NumberFormat
    private Integer clave;

    private String descripcion;

    private String modelo;

    private Double precio;

    private Integer existencia;

}

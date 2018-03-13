package com.damian.vendimia.dominio;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by desarrollo on 9/03/18.
 */

@Document(collection = "configuracion")
@Data
public class Configuracion {
    @Id
    @Column(name = "_id")
    private String id;

    private Double tasaFinanciamiento;

    private Double enganche;

    private Integer plazo;
}

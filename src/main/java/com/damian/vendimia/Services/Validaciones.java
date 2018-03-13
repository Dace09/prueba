package com.damian.vendimia.Services;

import org.springframework.stereotype.Service;

@Service
public class Validaciones {
    public void validarVacio(String str, String mensaje) throws Exception {
        if (str.isEmpty()){
            throw new Exception(mensaje);
        }
    }

    public void validarNull(Object obj, String mensaje) throws Exception {
        if (obj == null) {
            throw new Exception(mensaje);
        }
    }

    
}

package com.damian.vendimia.tes;

import com.damian.vendimia.dominio.Producto;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class config extends RepositoryRestConfigurerAdapter {
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Producto.class);
        config.setReturnBodyForPutAndPost(true);
    }
}

package org.razkevich.jerseyconfig;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyServletConfigurer extends ResourceConfig {

    public JerseyServletConfigurer() {
        register(ConstraintViolationExceptionMapper.class);
    }

}

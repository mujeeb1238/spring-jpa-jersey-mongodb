package com.beee.sample.config;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfigurations extends ResourceConfig {

	    /**
	     * Register JAX-RS application components.
	     */
	    public ApplicationConfigurations() {
	    	packages("com.beee.sample.api");
	    }
	
}

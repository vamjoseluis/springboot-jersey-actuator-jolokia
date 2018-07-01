package com.tuxpuckpepe.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import resource.StoresResource;

/**
 * 
 * @author Tuxpuckpepe
 * This class register all the services (ResourcesConfig)
 * I's managed by spring (@Component) 
 */
@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig() {
		register(StoresResource.class);
	}
}

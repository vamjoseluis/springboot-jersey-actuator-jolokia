package com.tuxpuckpepe;

import org.jolokia.http.AgentServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


/**
 * 
 * @author Tuxpuckpepe
 *
 */
@SpringBootApplication
public class SpringBootApp 
{    
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootApp.class, args);
	}
	
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new AgentServlet(), "/jolokia/*");
    }
}

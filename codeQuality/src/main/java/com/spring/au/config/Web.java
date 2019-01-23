package com.spring.au.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

public class Web {
	
		  @Bean 
		  ServletWebServerFactory servletWebServerFactory(){
		  return new TomcatServletWebServerFactory();
		  }
		

}

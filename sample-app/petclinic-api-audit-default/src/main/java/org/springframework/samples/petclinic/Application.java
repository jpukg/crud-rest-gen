package org.springframework.samples.petclinic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication	
@EnableJpaRepositories(basePackages = "com.octo.tools.samples.petclinic.repository")
@EntityScan({"org.springframework.samples.petclinic.model"})
@ComponentScan({"com.octo.tools.crud.filter", "com.octo.tools.audit", 
	"com.octo.tools.samples.petclinic.repository.audit"})	
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {		
		return application.sources(Application.class);
	}
	
	public static void main(String[] args) {
		 new SpringApplicationBuilder(Application.class)         
         .run(args);
	}
}

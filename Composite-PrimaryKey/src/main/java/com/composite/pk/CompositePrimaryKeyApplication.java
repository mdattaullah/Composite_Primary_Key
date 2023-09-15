package com.composite.pk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.composite.pk.entities.Person;
import com.composite.pk.repo.PersonRepo;
import com.composite.pk.service.PersonService;

@SpringBootApplication
public class CompositePrimaryKeyApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context= SpringApplication.run(CompositePrimaryKeyApplication.class, args);
		PersonService service=  context.getBean(PersonService.class);
		//service.savePerson();
		service.getPerson();
		
		
		
	}

}

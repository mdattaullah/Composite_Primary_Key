package com.composite.pk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.composite.pk.entities.Person;
import com.composite.pk.entities.PersonPk;
import com.composite.pk.repo.PersonRepo;



@Service
public class PersonService {
	
	@Autowired
	private PersonRepo personRepo;
	
	public void savePerson() {
		PersonPk pk=new PersonPk();
		pk.setAadharNo(23879734);
		pk.setMobileNo(82678224);
		pk.setPassport("PA922sf47F");
		
		Person p=new Person();
		p.setName("Amiadfh");
		p.setEmail("ersdcjwecwecciji@gmail.com");
		p.setPersonPk(pk);
		personRepo.save(p);
		
	}
	public void getPerson() {
		PersonPk pk=new PersonPk();
		pk.setAadharNo(23879734);
		pk.setMobileNo(82678224);
		pk.setPassport("PA922sf47F");
		Optional<Person> findById = personRepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
	}
	
	
	

}

package com.composite.pk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.composite.pk.entities.Person;
import com.composite.pk.entities.PersonPk;

public interface PersonRepo extends JpaRepository<Person, PersonPk>{

}

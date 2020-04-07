package com.example.training.repository;

import com.example.training.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person getPersonById(long id);
    Person savePerson(Person person);
}

package com.example.training.repository;

import java.util.List;

import com.example.training.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByPersonNumber(String personNumber);
    List<Person> findByFirstName(String firstName);
    List<Person> findByFirstNameOrderByFirstName(String name);
    List<Person> findByLastName(String lastName);
}

package com.example.training.controller;

import com.example.training.dto.PersonDto;
import com.example.training.mapper.PersonMapper;
import com.example.training.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${api.context}/${api.version}")
public class PersonController {

    private final PersonService personService;
    private final PersonMapper personMapper;

    @Autowired
    public PersonController(PersonService personService, PersonMapper personMapper) {
        this.personService = personService;
        this.personMapper = personMapper;
    }

    @GetMapping(value = "/person/{id}")
    public PersonDto getPerson(@PathVariable("id") long id) {
        return personMapper.toDto(personService.getPerson(id));
    }

    @PostMapping(value = "/person/create")
    public PersonDto createPerson(@RequestBody PersonDto person) {
        return new PersonDto();
    }

    @PutMapping(value = "/person/update/{personId}")
    public PersonDto updatePerson(@PathVariable String personId) {
        return new PersonDto();
    }

    @DeleteMapping(value = "/person/delete/{id}")
    public void deletePerson(@PathVariable("id") long id) {

    }
}

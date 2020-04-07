package com.example.training.controller;

import com.example.training.dto.AccountDto;
import com.example.training.dto.PersonDto;
import com.example.training.mappers.AccountMapper;
import com.example.training.mappers.PersonMapper;
import com.example.training.service.OrchestrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: 25/03/2020 Add appropriate annotation(-s) to 'tell' Spring that this class will be used as controller
@RestController
@RequestMapping("${api.context}/${api.version}")
public class AccountController {

    /* TODO: 25/03/2020 Implement all necessary controller method to make able create account, update account,
        delete account, create person in the system, edit limited person information, delete person, search person by different keys,
        etc..
    */

    private final OrchestrationService orchestrationService;
    private final AccountMapper accountMapper;
    private final PersonMapper personMapper;

    @Autowired
    public AccountController(OrchestrationService orchestrationService, AccountMapper accountMapper,
                             PersonMapper personMapper) {
        this.orchestrationService = orchestrationService;
        this.accountMapper = accountMapper;
        this.personMapper = personMapper;
    }

    @GetMapping(value = "/account/{id}")
    public AccountDto getAccount(@PathVariable("id") long id) {
        return accountMapper.toDto(orchestrationService.getAccountById(20));
    }

    @PostMapping(value = "/account/create")
    public AccountDto createAccount(@RequestBody AccountDto account) {
        return new AccountDto();
    }

    @PutMapping(value = "/account/update/{accountId}")
    public AccountDto updateAccount(@PathVariable String accountId) {
        return new AccountDto();
    }

    @DeleteMapping(value = "/account/delete/{id}")
    public void deleteAccount(@PathVariable("id") long id) {

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

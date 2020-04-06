package com.example.training.controller;

import com.example.training.dto.AccountDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: 25/03/2020 Add appropriate annotation(-s) to 'tell' Spring that this class will be used as controller
@RestController
@RequestMapping("${api.context/${api.version}")
public class AccountController {

    /* TODO: 25/03/2020 Implement all necessary controller method to make able create account, update account,
        delete account, create person in the system, edit limited person information, delete person, search person by different keys,
        etc..
    */

    @PostMapping(value = "/create")
    public AccountDto createAccount(@RequestBody AccountDto account) {
        return new AccountDto();
    }

    @PutMapping(value = "/update/{accountId}")
    public AccountDto updateAccount(@PathVariable String accountId) {
        return new AccountDto();
    }

}

package com.example.training.controller;

import com.example.training.dto.AccountDto;
import com.example.training.dto.validation.constraint.ValidAccountDto;
import com.example.training.mappers.AccountMapper;
import com.example.training.model.AccountInformation;
import com.example.training.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
@Validated
public class AccountController {

    /* TODO: 25/03/2020 Implement all necessary controller method to make able create account, update account,
        delete account, create person in the system, edit limited person information, delete person, search person by different keys,
        etc..
    */

    private final AccountMapper accountMapper;
    private final AccountService accountService;

    @Autowired
    public AccountController( AccountMapper accountMapper, AccountService accountService) {
        this.accountMapper = accountMapper;
        this.accountService = accountService;
    }

    @GetMapping(value = "/account/{id}")
    public AccountDto getAccount(@PathVariable("id") long id) {
        return accountMapper.toDto(new AccountInformation());
    }

    @PostMapping(value = "/account/create")
    public void createAccount(@RequestBody @ValidAccountDto AccountDto account) {
        accountService.saveAccount(accountMapper.toDomain(account));
    }

    @PutMapping(value = "/account/update/{accountId}")
    public AccountDto updateAccount(@PathVariable String accountId) {
        return new AccountDto();
    }

    @DeleteMapping(value = "/account/delete/{id}")
    public void deleteAccount(@PathVariable("id") long id) {

    }
}

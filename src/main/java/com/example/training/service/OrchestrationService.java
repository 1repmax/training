package com.example.training.service;

import com.example.training.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class which will act as orchestrator for {@code Account Service} and {@code Person Service}.
 *
 */
@Service
public class OrchestrationService {

    private final AccountService accountService;
    private final PersonService personService;

    @Autowired
    public OrchestrationService(AccountService accountService, PersonService personService) {
        this.accountService = accountService;
        this.personService = personService;
    }

    public Account getAccountById(long id) {
        return accountService.getAccount(id);
    }
}

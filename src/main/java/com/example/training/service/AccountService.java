package com.example.training.service;

import com.example.training.model.AccountInformation;
import com.example.training.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    /* TODO: 25/03/2020 Implement service logic, which will contain all necessary methods and functionality to be used from controller
        Note that all logic might be separated into several classes and try to follow Single Responsibility Principle.
        Try to add error handling and exception in some cases, where, you think, it may be appropriate.
        Try to use as much Stream API/Optionals/Lambdas as you can, to try yourself (the easiest way, I think,
        is to write code how you can/cover by tests and then refactor it using lambdas and other Java8 things)
     */

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    /**
     * Allows to retrieve account by providing an account ID.
     * @param id Identifier of the account to fetch from database
     * @return Account object
     */
    AccountInformation getAccountInformation(long id) {
        return accountRepository.getAccountInformationById(id);
    }

    public AccountInformation saveAccount(AccountInformation accountInformation) {
        return accountRepository.save(accountInformation);
    }
}

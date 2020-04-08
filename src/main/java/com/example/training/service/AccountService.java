package com.example.training.service;

import java.util.Optional;

import com.example.training.exception.ServiceException;
import com.example.training.model.AccountInformation;
import com.example.training.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public Optional<AccountInformation> findById(long id) {
        return accountRepository.findById(id);
    }

    @Transactional
    public AccountInformation updateById(long id, AccountInformation accountInformation) {
        Integer updatedItem = accountRepository.updateById(id, accountInformation.getLinkedEmailAddress(),
                accountInformation.getPassword());
        Optional<AccountInformation> updatedAccount = Optional.empty();
        if (updatedItem > 0) {
            updatedAccount = accountRepository.findById(Long.valueOf(updatedItem));
        }
       return updatedAccount.orElseThrow(()-> new ServiceException("Account was not updated or does not exist"));
    }

    @Transactional
    public Integer deleteAccountById(long id) {
        return accountRepository.deleteById(id);
    }
}

package com.example.training.dto.builders;

import com.example.training.dto.AccountDto;
import com.rits.cloning.Cloner;

public final class AccountDtoBuilder {

    private AccountDto template;

    private AccountDtoBuilder() {
        template = new AccountDto();
    }

    private AccountDtoBuilder(AccountDto accountDto) {
        template = Cloner.standard().deepClone(accountDto);
    }

    public static AccountDtoBuilder getBuilder(AccountDto accountDto) {
       return new AccountDtoBuilder(accountDto);
    }

    public static AccountDtoBuilder getBuilder() {
        return new AccountDtoBuilder();
    }

    public AccountDtoBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public AccountDtoBuilder linkedEmailAddress(String linkedEmailAddress) {
        template.setLinkedEmailAddress(linkedEmailAddress);
        return this;
    }

    public AccountDtoBuilder password(String password) {
        template.setPassword(password);
        return this;
    }

    public AccountDtoBuilder withDefaults() {
        template.setId(10);
        return this;
    }

    public AccountDto build() {
        return template;
    }
}

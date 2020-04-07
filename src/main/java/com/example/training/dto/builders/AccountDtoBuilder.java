package com.example.training.dto.builders;

import com.example.training.dto.AccountDto;
import com.example.training.dto.PersonDto;
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

    public AccountDtoBuilder person(PersonDto personDto) {
        template.setPerson(personDto);
        return this;
    }

    public AccountDtoBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public AccountDto build() {
        return template;
    }
}

package com.example.training.model.builders;

import com.example.training.model.Account;
import com.example.training.model.Person;
import com.rits.cloning.Cloner;

public class AccountBuilder {

    private Account template;

    private AccountBuilder() {
        template = new Account();
    }

    private AccountBuilder(Account account) {
        template = Cloner.standard().deepClone(account);
    }

    public static AccountBuilder getBuilder(Account account) {
        return new AccountBuilder(account);
    }

    public static AccountBuilder getBuilder() {
        return new AccountBuilder();
    }

    public AccountBuilder person(Person person) {
        template.setPerson(person);
        return this;
    }

    public AccountBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public AccountBuilder withDefaults() {
        template.setPerson(new Person());
        template.setId(10);
        return this;
    }

    public Account build() {
        return template;
    }
}

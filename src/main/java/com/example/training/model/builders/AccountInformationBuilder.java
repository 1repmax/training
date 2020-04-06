package com.example.training.model.builders;

import com.example.training.model.AccountInformation;

public final class AccountInformationBuilder {

    private long id;
    private String linkedEmailAddress;
    private String password;

    private AccountInformationBuilder() {
    }

    public static AccountInformationBuilder getBuilder() {
        return new AccountInformationBuilder();
    }

    public AccountInformationBuilder id(long id) {
        this.id = id;
        return this;
    }

    public AccountInformationBuilder linkedEmailAddress(String linkedEmailAddress) {
        this.linkedEmailAddress = linkedEmailAddress;
        return this;
    }

    public AccountInformationBuilder password(String password) {
        this.password = password;
        return this;
    }

    public AccountInformation build() {
        AccountInformation accountInformation = new AccountInformation();
        accountInformation.setId(id);
        accountInformation.setLinkedEmailAddress(linkedEmailAddress);
        accountInformation.setPassword(password);
        return accountInformation;
    }
}

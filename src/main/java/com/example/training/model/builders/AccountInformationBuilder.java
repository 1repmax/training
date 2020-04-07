package com.example.training.model.builders;

import com.example.training.model.AccountInformation;
import com.rits.cloning.Cloner;

public final class AccountInformationBuilder {

    private AccountInformation template;

   private AccountInformationBuilder() {
       template = new AccountInformation();
   }

   private AccountInformationBuilder(AccountInformation accountInformation) {
       template = Cloner.standard().deepClone(accountInformation);
   }

   public static AccountInformationBuilder getBuilder() {
       return new AccountInformationBuilder();
   }

   public static AccountInformationBuilder getBuilder(AccountInformation accountInformation) {
       return new AccountInformationBuilder(accountInformation);
   }

    public AccountInformationBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public AccountInformationBuilder linkedEmailAddress(String linkedEmailAddress) {
        template.setLinkedEmailAddress(linkedEmailAddress);
        return this;
    }

    public AccountInformationBuilder password(String password) {
        template.setPassword(password);
        return this;
    }

    public AccountInformation build() {
        return template;
    }
}

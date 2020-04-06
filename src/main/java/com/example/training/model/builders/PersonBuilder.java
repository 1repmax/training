package com.example.training.model.builders;

import java.util.Arrays;
import java.util.List;

import com.example.training.model.AccountInformation;
import com.example.training.model.AddressInformation;
import com.example.training.model.Person;
import com.example.training.model.PhoneNumberInformation;

/**
 * Utility class for providing builder pattern for Person type.
 */
public final class PersonBuilder {

    private Person template;

    private PersonBuilder() {
        template = new Person();
    }

    private PersonBuilder(Person person) {
        template = person;
    }

    public static PersonBuilder getBuilder() {
        return new PersonBuilder();
    }

    public static PersonBuilder getBuilder(Person person) {
        return new PersonBuilder(person);
    }

    public PersonBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public PersonBuilder personNumber(String personNumber) {
        template.setPersonNumber(personNumber);
        return this;
    }

    public PersonBuilder firstName(String firstName) {
        template.setFirstName(firstName);
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        template.setLastName(lastName);
        return this;
    }

    public PersonBuilder fullName(String fullName) {
        template.setFirstName(fullName.split("\\s+")[0]);
        template.setLastName(fullName.split("\\s+")[1]);
        return this;
    }

    public PersonBuilder phoneNumberInformation(PhoneNumberInformation phoneNumberInformation) {
        template.setPhoneNumberInformation(phoneNumberInformation);
        return this;
    }

    public PersonBuilder addressInformation(AddressInformation addressInformation) {
        template.setAddressInformation(addressInformation);
        return this;
    }

    public PersonBuilder accountInformation(List<AccountInformation> accountInformations) {
        template.setAccountInformations(accountInformations);
        return this;
    }

    public PersonBuilder accountInformations(AccountInformation ... accountInformations) {
        template.setAccountInformations(Arrays.asList(accountInformations));
        return this;
    }

    public Person build() {
        return template;
    }
}

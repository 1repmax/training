package com.example.training.dto.builders;

import java.util.Arrays;
import java.util.List;

import com.example.training.dto.PersonDto;
import com.example.training.model.AccountInformation;
import com.example.training.model.AddressInformation;
import com.example.training.model.PhoneNumberInformation;
import com.rits.cloning.Cloner;

public final class PersonDtoBuilder {

    private PersonDto template;

    private PersonDtoBuilder() {
        template = new PersonDto();
    }

    private PersonDtoBuilder(PersonDto personDto) {
        template = Cloner.standard().deepClone(personDto);
    }

    public static PersonDtoBuilder getBuilder() {
        return new PersonDtoBuilder();
    }

    public static PersonDtoBuilder getBuilder(PersonDto personDto) {
        return new PersonDtoBuilder(personDto);
    }

    public PersonDtoBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public PersonDtoBuilder personNumber(String personNumber) {
        template.setPersonNumber(personNumber);
        return this;
    }

    public PersonDtoBuilder firstName(String firstName) {
        template.setFirstName(firstName);
        return this;
    }

    public PersonDtoBuilder lastName(String lastName) {
        template.setLastName(lastName);
        return this;
    }

    public PersonDtoBuilder fullName(String fullName) {
        template.setFirstName(fullName.split("\\s+")[0]);
        template.setLastName(fullName.split("\\s+")[1]);
        return this;
    }

    public PersonDtoBuilder phoneNumberInformation(PhoneNumberInformation phoneNumberInformation) {
        template.setPhoneNumberInformation(phoneNumberInformation);
        return this;
    }

    public PersonDtoBuilder addressInformation(AddressInformation addressInformation) {
        template.setAddressInformation(addressInformation);
        return this;
    }

    public PersonDtoBuilder accountInformations(List<AccountInformation> accountInformations) {
        template.setAccountInformations(accountInformations);
        return this;
    }

    public PersonDtoBuilder accountInformations(AccountInformation ... accountInformations) {
        template.setAccountInformations(Arrays.asList(accountInformations));
        return this;
    }

    public PersonDtoBuilder withDefaults() {
        template.setId(10);
        template.setFirstName("Raivo");
        template.setLastName("Lapins");
        template.setFullName("Raivo Lapins");
        template.setAccountInformations(Arrays.asList(new AccountInformation()));
        template.setAddressInformation(new AddressInformation());
        template.setPhoneNumberInformation(new PhoneNumberInformation());
        template.setPersonNumber("personNumber");
        return this;
    }

    public PersonDto build() {
        return template;
    }
}

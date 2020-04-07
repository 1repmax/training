package com.example.training.model.builders;

import com.example.training.model.PhoneNumberInformation;
import com.rits.cloning.Cloner;

public final class PhoneNumberInformationBuilder {

    private PhoneNumberInformation template;

    private PhoneNumberInformationBuilder() {
        template = new PhoneNumberInformation();
    }

    private PhoneNumberInformationBuilder(PhoneNumberInformation phoneNumberInformation) {
        template= Cloner.standard().deepClone(phoneNumberInformation);
    }

    public static PhoneNumberInformationBuilder getBuilder() {
        return new PhoneNumberInformationBuilder();
    }

    public static PhoneNumberInformationBuilder getBuilder(PhoneNumberInformation phoneNumberInformation) {
        return new PhoneNumberInformationBuilder(phoneNumberInformation);
    }

    public PhoneNumberInformationBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public PhoneNumberInformationBuilder mainPhoneNumber(String mainPhoneNumber) {
        template.setMainPhoneNumber(mainPhoneNumber);
        return this;
    }

    public PhoneNumberInformationBuilder additionalPhoneNumber(String additionalPhoneNumber) {
        template.setAdditionalPhoneNumber(additionalPhoneNumber);
        return this;
    }

    public PhoneNumberInformationBuilder country(String country) {
        template.setCountry(country);
        return this;
    }

    public PhoneNumberInformationBuilder operator(String operator) {
        template.setOperator(operator);
        return this;
    }

    public PhoneNumberInformation build() {
        return template;
    }
}

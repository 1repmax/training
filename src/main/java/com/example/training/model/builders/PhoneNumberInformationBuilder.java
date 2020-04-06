package com.example.training.model.builders;

import com.example.training.model.PhoneNumberInformation;

public final class PhoneNumberInformationBuilder {

    private long id;
    private String mainPhoneNumber;
    private String additionalPhoneNumber;
    private String country;
    private String operator;

    private PhoneNumberInformationBuilder() {
    }

    public static PhoneNumberInformationBuilder getBuilder() {
        return new PhoneNumberInformationBuilder();
    }

    public PhoneNumberInformationBuilder id(long id) {
        this.id = id;
        return this;
    }

    public PhoneNumberInformationBuilder mainPhoneNumber(String mainPhoneNumber) {
        this.mainPhoneNumber = mainPhoneNumber;
        return this;
    }

    public PhoneNumberInformationBuilder additionalPhoneNumber(String additionalPhoneNumber) {
        this.additionalPhoneNumber = additionalPhoneNumber;
        return this;
    }

    public PhoneNumberInformationBuilder country(String country) {
        this.country = country;
        return this;
    }

    public PhoneNumberInformationBuilder operator(String operator) {
        this.operator = operator;
        return this;
    }

    public PhoneNumberInformation build() {
        PhoneNumberInformation phoneNumberInformation = new PhoneNumberInformation();
        phoneNumberInformation.setId(id);
        phoneNumberInformation.setMainPhoneNumber(mainPhoneNumber);
        phoneNumberInformation.setAdditionalPhoneNumber(additionalPhoneNumber);
        phoneNumberInformation.setCountry(country);
        phoneNumberInformation.setOperator(operator);
        return phoneNumberInformation;
    }
}

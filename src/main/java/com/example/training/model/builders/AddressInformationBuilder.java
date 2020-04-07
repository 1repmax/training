package com.example.training.model.builders;

import com.example.training.model.AddressInformation;
import com.rits.cloning.Cloner;

public final class AddressInformationBuilder {

    private AddressInformation template;

    private AddressInformationBuilder() {
        template = new AddressInformation();
    }

    private AddressInformationBuilder(AddressInformation addressInformation) {
        template = Cloner.standard().deepClone(addressInformation);
    }

    public AddressInformationBuilder getBuilder() {
        return new AddressInformationBuilder();
    }

    public AddressInformationBuilder getBuilder(AddressInformation addressInformation) {
        return new AddressInformationBuilder(addressInformation);
    }

    public AddressInformationBuilder id(long id) {
        template.setId(id);
        return this;
    }

    public AddressInformationBuilder mainAddress(String mainAddress) {
        template.setMainAddress(mainAddress);
        return this;
    }

    public AddressInformationBuilder additionalAddress(String additionalAddress) {
        template.setAdditionalAddress(additionalAddress);
        return this;
    }

    public AddressInformationBuilder city(String city) {
        template.setCity(city);
        return this;
    }

    public AddressInformationBuilder country(String country) {
        template.setCountry(country);
        return this;
    }

    public AddressInformationBuilder postalCode(String postalCode) {
        template.setPostalCode(postalCode);
        return this;
    }

    public AddressInformation build() {
        return template;
    }
}

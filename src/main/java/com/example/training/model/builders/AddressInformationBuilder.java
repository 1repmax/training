package com.example.training.model.builders;

import com.example.training.model.AddressInformation;

public final class AddressInformationBuilder {

    private long id;
    private String mainAddress;
    private String additionalAddress;
    private String city;
    private String country;
    private String postalCode;

    private AddressInformationBuilder() {
    }

    public static AddressInformationBuilder getBuilder() {
        return new AddressInformationBuilder();
    }

    public AddressInformationBuilder id(long id) {
        this.id = id;
        return this;
    }

    public AddressInformationBuilder mainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
        return this;
    }

    public AddressInformationBuilder additionalAddress(String additionalAddress) {
        this.additionalAddress = additionalAddress;
        return this;
    }

    public AddressInformationBuilder city(String city) {
        this.city = city;
        return this;
    }

    public AddressInformationBuilder country(String country) {
        this.country = country;
        return this;
    }

    public AddressInformationBuilder postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public AddressInformation build() {
        AddressInformation addressInformation = new AddressInformation();
        addressInformation.setId(id);
        addressInformation.setMainAddress(mainAddress);
        addressInformation.setAdditionalAddress(additionalAddress);
        addressInformation.setCity(city);
        addressInformation.setCountry(country);
        addressInformation.setPostalCode(postalCode);
        return addressInformation;
    }
}

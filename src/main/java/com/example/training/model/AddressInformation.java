package com.example.training.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class AddressInformation {

    @Id
    @GeneratedValue
    private long id;
    private String mainAddress;
    private String additionalAddress;
    private String city;
    private String country;
    private String postalCode;
}

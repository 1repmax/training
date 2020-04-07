package com.example.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

// FIXME: 25/03/2020 Note that some information or links might be missed in entity classes

@Data
@NoArgsConstructor
@Entity
public class PhoneNumberInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String mainPhoneNumber;
    private String additionalPhoneNumber;
    private String country;
    private String operator;
}

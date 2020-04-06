package com.example.training.model;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String personNumber;
    private String firstName;
    private String lastName;
    private String fullName;

    private PhoneNumberInformation phoneNumberInformation;
    private AddressInformation addressInformation;
    private List<AccountInformation> accountInformations;

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

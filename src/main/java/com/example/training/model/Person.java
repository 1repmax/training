package com.example.training.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

import lombok.Data;

@Data
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String personNumber;
    private String firstName;
    private String lastName;
    // TODO: 25/03/2020 Implement getter in the way to concat first and last names when attribute is asked DONE
    private String fullName;

    private PhoneNumberInformation phoneNumberInformation;
    private AddressInformation addressInformation;
    //private List<AccountInformation> accountInformations;

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

package com.example.training.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table
@Entity
public class Person {

    @Id
    @GeneratedValue
    private long id;
    private String personNumber;
    private String firstName;
    private String lastName;
    private String fullName;

    private PhoneNumberInformation phoneNumberInformation;

    @Column(name = "ADDRESS_INFORMATION")
    private AddressInformation addressInformation;

    @Column
    @ElementCollection(targetClass=AccountInformation.class)
    @OneToMany(mappedBy = , targetEntity = )
    private List<AccountInformation> accountInformations;

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

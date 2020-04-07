package com.example.training.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "Person")
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String personNumber;
    private String firstName;
    private String lastName;
    private String fullName;

    @OneToOne
    private PhoneNumberInformation phoneNumberInformation;

    @OneToOne
    private AddressInformation addressInformation;

    @Column
    @ElementCollection(targetClass=AccountInformation.class)
    @OneToMany
    private List<AccountInformation> accountInformations;

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }
}

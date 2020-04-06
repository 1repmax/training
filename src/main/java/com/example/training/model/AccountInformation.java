package com.example.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class AccountInformation {

    @Id
    @GeneratedValue
    private long id;
    private String linkedEmailAddress;
    private String password;
}

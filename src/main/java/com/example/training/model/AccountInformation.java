package com.example.training.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class AccountInformation {

    @Id
    @GeneratedValue
    private long id;
    private String linkedEmailAddress;
    private String password;
}

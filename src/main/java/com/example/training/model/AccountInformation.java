package com.example.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "AccountInformation")
@Table(name = "account_information")
public class AccountInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "LINKED_EMAIL_ADDRESS")
    private String linkedEmailAddress;

    @Column(name = "PASSWORD")
    private String password;
}

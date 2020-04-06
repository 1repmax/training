package com.example.training.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue
    private long id;
    private Person person;
}

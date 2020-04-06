package com.example.training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Object represents account information that is sent to third-party users.
 */
@Data
@NoArgsConstructor
public class AccountDto {

    private long id;
    private PersonDto person;
}

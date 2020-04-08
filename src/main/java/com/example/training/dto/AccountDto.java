package com.example.training.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
 * Object represents account information that is sent to third-party users.
 */
@Data
@NoArgsConstructor
public class AccountDto {

    private long id;

    private String linkedEmailAddress;

    @Length(min = 8, max = 30, message = "Password length must be 8 to 30 characters")
    private String password;
}

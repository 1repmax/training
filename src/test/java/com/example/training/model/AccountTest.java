package com.example.training.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void testHashAndEquals() {
        EqualsVerifier.forClass(Account.class).suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testToString() {
        Account account = new Account();
        String expected = "Account(id=0, person=null)";
        assertThat(account.toString()).isEqualTo(expected);
    }
}

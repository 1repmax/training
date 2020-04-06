package com.example.training.model.builders;

import com.example.training.model.Account;
import com.example.training.model.Person;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountBuilderTest {

    @Test
    public void testAccountBuilderWithDefaults() {
        Account account = AccountBuilder.getBuilder().withDefaults().build();
        assertThat(account.getId()).isEqualTo(10);
        assertThat(account.getPerson()).isEqualTo(new Person());
    }

    @Test
    public void testAccountBuilder() {
        Person person = new Person();
        person.setFirstName("Raivo");
        person.setLastName("Lapins");
        Account account = AccountBuilder.getBuilder()
                .person(person)
                .id(12)
                .build();

        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(account.getPerson().getFirstName()).isEqualTo("Raivo");
            softly.assertThat(account.getPerson().getLastName()).isEqualTo("Lapins");
        });
    }

    @Test
    public void testAccountBuilderWithProvidedAccountForBuilding() {
        Person person = new Person();
        person.setFirstName("Raivo");
        person.setLastName("Lapins");
        Account account = AccountBuilder.getBuilder().withDefaults().build();
        Account modifiedAccount = AccountBuilder.getBuilder(account)
                .id(20)
                .person(person)
                .build();


        SoftAssertions.assertSoftly(softly ->
        {
            //Assert that initial instance of account wasn't modified
            softly.assertThat(account.getPerson()).isEqualTo(new Person());
            softly.assertThat(account.getId()).isEqualTo(10);

            //Assert that newly created account instance has correct data
            softly.assertThat(modifiedAccount.getPerson()).isEqualTo(person);
            softly.assertThat(modifiedAccount.getId()).isEqualTo(20);
        });
    }
}

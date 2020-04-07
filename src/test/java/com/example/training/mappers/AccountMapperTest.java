package com.example.training.mappers;

import com.example.training.dto.AccountDto;
import com.example.training.model.Account;
import com.example.training.model.builders.AccountBuilder;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class AccountMapperTest {

    private AccountMapper mapper;

    @BeforeAll
    public void initialize() {
        mapper = Mappers.getMapper(AccountMapper.class);
    }

    @Test
    public void toDtoTest() {
        Account account = AccountBuilder.getBuilder().withDefaults().build();

        AccountDto accountDto = mapper.toDto(account);

        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(accountDto.getId()).isEqualTo(account.getId());
            softly.assertThat(accountDto.getPerson()).isEqualTo(account.getPerson());
        });
    }

    @Test
    public void toDomainTest() {

    }
}

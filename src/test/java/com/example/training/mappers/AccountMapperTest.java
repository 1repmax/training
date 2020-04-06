package com.example.training.mappers;

import com.example.training.dto.AccountDto;
import com.example.training.model.Account;
import com.example.training.model.builders.AccountBuilder;
import org.junit.jupiter.api.Test;

public class AccountMapperTest {

    @Test
    public void toDtoTest() {
        Account account = AccountBuilder.getBuilder().withDefaults().build();

        AccountDto accountDto = AccountMapper.INSTANCE.toDto(account);

    }
}

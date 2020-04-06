package com.example.training.mappers;

import com.example.training.dto.AccountDto;
import com.example.training.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Account mapper used for automatically generating mapper instances using MapStruct library.
 * Used to do transformations from DTO to domain objects for Account and AccountDto object instances.
 *
 * @since 0.0.1
 */
@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDto toDto(Account account);
    Account toDomain(AccountDto accountDto);
}

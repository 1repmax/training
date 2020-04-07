package com.example.training.mappers;

import com.example.training.dto.AccountDto;
import com.example.training.model.Account;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Account mapper used for automatically generating mapper instances using MapStruct library.
 * Used to do transformations from DTO to domain objects for Account and AccountDto object instances.
 *
 * @since 0.0.1
 */
@Mapper(componentModel = "spring")
public interface AccountMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "person", target = "person")
    AccountDto toDto(Account account);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "person", target = "person")
    Account toDomain(AccountDto accountDto);
}

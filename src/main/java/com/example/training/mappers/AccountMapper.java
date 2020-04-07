package com.example.training.mappers;

import com.example.training.dto.AccountDto;
import com.example.training.model.AccountInformation;
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
    @Mapping(target = "id", source = "id")
    @Mapping(target = "linkedEmailAddress", source = "linkedEmailAddress")
    @Mapping(target = "password", source = "password")
    AccountDto toDto(AccountInformation accountInformation);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "linkedEmailAddress", source = "linkedEmailAddress")
    @Mapping(target = "password", source = "password")
    AccountInformation toDomain(AccountDto accountDto);
}

package com.example.training.mapper;

import com.example.training.dto.PersonDto;
import com.example.training.model.Person;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Person mapper used for automatically generating mapper instances using MapStruct library.
 * Used to do transformations from DTO to domain objects for Person and PersonDto object instances.
 *
 * @since 0.0.1
 */
@Mapper(componentModel = "spring")
public interface PersonMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "personNumber", target = "personNumber")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "phoneNumberInformation", target = "phoneNumberInformation")
    @Mapping(source = "addressInformation", target = "addressInformation")
    @Mapping(source = "accountInformations", target = "accountInformations")
    PersonDto toDto(Person person);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    @Mapping(source = "personNumber", target = "personNumber")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "phoneNumberInformation", target = "phoneNumberInformation")
    @Mapping(source = "addressInformation", target = "addressInformation")
    @Mapping(source = "accountInformations", target = "accountInformations")
    Person toDomain(PersonDto personDto);
}

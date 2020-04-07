package com.example.training.mappers;

import com.example.training.dto.PersonDto;
import com.example.training.model.Person;
import org.mapstruct.Mapper;

/**
 * Person mapper used for automatically generating mapper instances using MapStruct library.
 * Used to do transformations from DTO to domain objects for Person and PersonDto object instances.
 *
 * @since 0.0.1
 */
@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto toDto(Person person);
    Person toDomain(PersonDto personDto);
}

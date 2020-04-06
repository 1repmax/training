package com.example.training.dto;

import java.util.List;

import com.example.training.model.AccountInformation;
import com.example.training.model.AddressInformation;
import com.example.training.model.PhoneNumberInformation;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonDto {

    /* TODO: 25/03/2020 To avoid direct communication between UI and BE layers, usually DTO (data transfer object) are used
        Please add all necessary information that you want to show/send to UI via controller (mappers might be required)
        NB: New classes can be added as well
        Useful link to read: https://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application
     */

    /**
     * From task requirements and specification it is hard to interpret what data should be shown via DTO objects and what data should be
     * used in domain objects only. I will make assumption that I am implementing API for third parties and all this information
     * is necessary.
     */

    private long id;
    private String personNumber;
    private String firstName;
    private String lastName;
    private String fullName;

    private PhoneNumberInformation phoneNumberInformation;
    private AddressInformation addressInformation;
    private List<AccountInformation> accountInformations;
}

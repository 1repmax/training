//package com.example.training.repository;
//
//import com.example.training.model.AccountInformation;
//import com.example.training.model.Person;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface AccountRepository extends JpaRepository<AccountInformation, Long> {
//
//    /* Queries might be defined by hand. By default JPQL query is used here.
//     For more information, please, refer to: https://www.baeldung.com/spring-data-jpa-query */
//    @Query("select p from Person p where (p.firstName = ?1 or p.lastName = ?1 or p.personNumber = ?1 or p.fullName = ?1)")
//    List<Person> getPeopleByKey(String searchKey);
//
//    /* This method will search by passed email, although query is not written by hand.
//    For more information, please, refer to: https://www.baeldung.com/spring-data-derived-queries */
//    List<AccountInformation> getAccountInformationByLinkedEmailAddress(String linkedEmailAddress);
//
//    // TODO: 25/03/2020 Add few methods that edits data via query methods
//
//}

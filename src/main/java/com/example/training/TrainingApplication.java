package com.example.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class, args);
    }

    // TODO: 25/03/2020 Add lombok to the project and replace IDE generated setters/getters etc. with appropriate annotations
    // TODO: 25/03/2020 Add any DB to the project (H2 is preferable as it is much easier to work with it in current case)

    /*
     * Before start I would advise to read some useful links: https://www.baeldung.com/spring-bean-annotations
     * https://www.baeldung.com/spring-component-repository-service
     */

	// TODO: 25/03/2020 Implemented logic should be covered by tests as well. (JUnit + Mockito)
}

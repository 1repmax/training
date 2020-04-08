package com.example.training.dto.validation;

import javax.validation.ConstraintValidatorContext;

import com.example.training.dto.AccountDto;
import com.example.training.dto.builders.AccountDtoBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.training.testconstants.Constants.INVALID_EMAIL;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class ValidAccountDtoValidatorTest {

    private static ValidAccountDtoValidator validator;
    private static ConstraintValidatorContext context;

    @BeforeEach
    public void initialize() {
        validator = new ValidAccountDtoValidator();
        context = mock(ConstraintValidatorContext.class);
    }

    @Test
    public void testIsValidReturnsTrue() {
        AccountDto accountDto = AccountDtoBuilder.getBuilder().withDefaults().build();
        assertThat(validator.isValid(accountDto, context)).isTrue();
    }

    @Test
    public void testIsValidReturnsForInvalidEmail() {
        AccountDto accountDto = AccountDtoBuilder.getBuilder().withDefaults().linkedEmailAddress(INVALID_EMAIL).build();
        assertThat(validator.isValid(accountDto, context)).isFalse();
    }

    @Test
    public void testIsValidReturnsFalseIfNoPassword() {
        AccountDto accountDto = AccountDtoBuilder.getBuilder().withDefaults().password(null).build();
        assertThat(validator.isValid(accountDto, context)).isFalse();
    }

    @Test
    public void testIsValidReturnsFalseIfNoPasswordAndInvalidEmail() {
        AccountDto accountDto = AccountDtoBuilder
                .getBuilder()
                .withDefaults()
                .password(null)
                .linkedEmailAddress(INVALID_EMAIL)
                .build();
        assertThat(validator.isValid(accountDto, context)).isFalse();
    }

}

package com.example.training.dto.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.training.dto.AccountDto;
import com.example.training.dto.validation.constraint.ValidAccountDto;
import org.springframework.util.StringUtils;

public class ValidAccountDtoValidator implements ConstraintValidator<ValidAccountDto, AccountDto> {

    private static final String PATTERN_STRING = "^(.+)@(.+)$";
    private static final Pattern PATTERN = Pattern.compile(PATTERN_STRING);

    @Override
    public boolean isValid(AccountDto value, ConstraintValidatorContext context) {
        Matcher matcher = PATTERN.matcher(value.getLinkedEmailAddress());
        return matcher.matches() && !StringUtils.isEmpty(value.getPassword());
    }
}

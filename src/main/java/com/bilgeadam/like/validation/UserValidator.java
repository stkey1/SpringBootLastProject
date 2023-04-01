package com.bilgeadam.like.validation;

import com.bilgeadam.like.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class UserValidator {

    public void userSaveValidator(UserDto userDto) {

    }
}
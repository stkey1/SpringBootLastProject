package com.bilgeadam.like.validation;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class UserValidator {

    public void userSaveValidator(UserDto userDto) {

    }
}
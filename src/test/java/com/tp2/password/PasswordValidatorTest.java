package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    // TODO: Replace these lines with your tests
    @Test
    void exampleTest(){
        assertFalse(PasswordValidator.isValid("passwor"));
        assertFalse(PasswordValidator.isValid("password"));
        assertFalse(PasswordValidator.isValid("Password"));
        assertFalse(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("Password-1"));
    }

//    Missing tests:
//
//- Password with less than 8 characters should be invalid
//- Password with 8 or more characters should pass length validation
//- Password without uppercase letter should be invalid
//- Password without lowercase letter should be invalid
//- Password without number should be invalid
//- Password without special character should be invalid
//- Password meeting all criteria should be valid
}

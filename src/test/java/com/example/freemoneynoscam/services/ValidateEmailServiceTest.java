package com.example.freemoneynoscam.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateEmailServiceTest {
    //Arrange
    ValidateEmailService service = new ValidateEmailService();

    @Test
    void isEmailValid() {
        String emailValid = "nifr@kea.dk";
        String emailInvalid = "nifr@dk";
        String isThisValid = ".@";
        //Act
        boolean result1 = service.isEmailValid(emailValid);
        boolean result2 = service.isEmailValid(emailInvalid);
        boolean result3 = service.isEmailValid(isThisValid);

        //Assert
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
    }

}

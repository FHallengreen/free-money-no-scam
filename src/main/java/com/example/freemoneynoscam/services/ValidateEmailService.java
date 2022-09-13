package com.example.freemoneynoscam.services;

import org.springframework.web.context.request.WebRequest;

public class ValidateEmailService {

    public boolean isEmailValid(String email) {
        return email.contains("@") && email.contains(".");
    }
}

package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
        final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";

        final String username = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
        final String domain = "\\@[a-z]{3}[a-z]*\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";

        final String EMAIL = username + domain;

        String firstName = "Amaya";
        String lastName = "Prashant";
        String email = "amayaprasant12@gmail.com";

        // First Name validation
        if (Pattern.matches(FIRST_NAME, firstName)) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid");
        }

        // Last Name Validation
        if (Pattern.matches(LAST_NAME, lastName)) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid");
        }

        // Email Validation
        if (Pattern.matches(EMAIL, email)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }
}

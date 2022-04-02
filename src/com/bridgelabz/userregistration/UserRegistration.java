package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
        final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";

        final String USER_NAME = "^[A-Za-z][A-Za-z0-9+-]{2}[A-Za-z0-9+-]*([.][A-Za-z0-9]{2}[A-Za-z0-9]*)?";
        final String DOMAIN = "\\@[a-z]{3}[a-z]*\\.[a-z]{2}[a-z]*([.][a-z]{2}[a-z]*)?";
        final String EMAIL = USER_NAME + DOMAIN;

        final String PHONE_NO = "^([0-9]{2}[\\-])*[0-9]{10}$";

        String firstName = "Amaya";
        String lastName = "Kishore";
        String email = "amayakishore12@gmail.com";
        String phoneNumber = "91 79218623";

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

        //Email Validation
        if (Pattern.matches(EMAIL, email)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid");
        }

        //Phone no: Validation
        if (Pattern.matches(PHONE_NO, phoneNumber)) {
            System.out.println("Valid phone number");
        } else {
            System.out.println("Invalid...");
        }
    }
}

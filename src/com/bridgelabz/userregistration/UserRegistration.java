package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";
        final String LAST_NAME = "^[A-Z][a-z]{2}[a-z]*";

        String firstName = "Amaya";
        String lastName = "Prasanth";

        // First Name validation
        if (Pattern.matches(FIRST_NAME, firstName)) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid");
        }

        //Last Name Validation
        if (Pattern.matches(FIRST_NAME, firstName)) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid");
        }

    }
}

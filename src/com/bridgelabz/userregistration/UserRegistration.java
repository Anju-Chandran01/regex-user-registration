package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        final String FIRST_NAME = "^[A-Z][a-z]{2}[a-z]*";

        String firstName = "Anju";

        if (Pattern.matches(FIRST_NAME, firstName)) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid");
        }

    }
}

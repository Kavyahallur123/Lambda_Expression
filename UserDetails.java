package com.bridgelabz.junit;

import java.util.Scanner;

public class UserDetails {
    Scanner sc = new Scanner(System.in);
    UserRegistration validUserInformation = new UserRegistration();

    public boolean userFirstName() throws UserRegistrationException {
        System.out.println("Enter Your First Name : ");
        String firstName = sc.next();
        return validUserInformation.firstName(firstName);
    }

    public boolean userLastName() throws UserRegistrationException {
        System.out.println("Enter Your Last Name : ");
        String lastName = sc.next();
        return validUserInformation.lastName(lastName);
    }

    public boolean userEmailId() throws UserRegistrationException {
        System.out.println("Enter Your Email : ");
        String emailID = sc.next();
        return validUserInformation.email(emailID);
    }

    public boolean userMobNum() throws UserRegistrationException {
        System.out.println("Enter Your Mobile Number : ");
        String mobileNum = sc.next();
        return validUserInformation.phoneNumber(mobileNum);
    }

    public String userPassword() throws UserRegistrationException {
        System.out.println("Enter Your Password : ");
        String passWord = sc.next();
        return validUserInformation.passwordRule(passWord);
    }
}
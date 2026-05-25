/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Admin01
 */import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // CALLING CLASS AND SCANNER TO MAIN METHOD //
        Scanner input = new Scanner(System.in);
        Login log = new Login();

                         // Registration//
        
        System.out.println("=========REGISTRATION=========");
        
        
                         // FIRST AND LAST NAME //
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println(" ");

                         // USERNAME //
        System.out.print("Enter username: ");
        String username = input.nextLine();

        if (log.checkUserName(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.print("Username is not correctly formatted;");
            System.out.println("please ensure that your password contains a underscore and is no more that five characters in length.");
        }

        System.out.println(" ");

                        // PASSWORD //
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (log.checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.print("Password is not correctly formatted; ");
            System.out.println("please ensure password contains atleast eight characters, a capital letter, a number and a special character.");
        }

                       // SOUTH AFRICAN CELLPHONE NUMBER //
        System.out.print("Enter cellphone number (+27xxxxxxxxx): ");
        String cell = input.nextLine();

        if (log.checkCellPhoneNumber(cell)) {
            System.out.println("Cell phone number successfully added.");
        } else {
            System.out.print("Cell phone number incorrectly formatted ");
            System.out.println("or does not contain international code. ");
        }

                      // LOGIN DETAILS//
        System.out.println("======LOGIN======");

        System.out.print("Enter username: ");
        String userName = input.nextLine();

        System.out.print("Enter password: ");
        String passWord = input.nextLine();

        System.out.println(" ");

        if (userName.equals(username) && passWord.equals(password)) {
            System.out.println("Welcome " + firstName + " " + lastName+".");
        } else {
            System.out.println("Username or password has been enterred incorrectly.");
        }
    }
}
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

        // SCANNER AND OBJECT
        Scanner input = new Scanner(System.in);
        Login log = new Login();

        // REGISTRATION
        System.out.println("=========REGISTRATION=========");

        // FIRST NAME
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        // LAST NAME
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println(" ");

        // USERNAME
        System.out.print("Enter username: ");
        String username = input.nextLine();

        if (log.checkUserName(username)) {

            System.out.println("Username successfully captured.");

        } else {

            System.out.println("Username is not correctly formatted.");
        }

        System.out.println(" ");

        // PASSWORD
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (log.checkPasswordComplexity(password)) {

            System.out.println("Password successfully captured.");

        } else {

            System.out.println("Password is not correctly formatted.");
        }

        System.out.println(" ");

        // CELLPHONE NUMBER
        System.out.print("Enter cellphone number (+27xxxxxxxxx): ");
        String cell = input.nextLine();

        if (log.checkCellPhoneNumber(cell)) {

            System.out.println("Cell phone number successfully added.");

        } else {

            System.out.println("Cell phone number incorrectly formatted.");
        }

        // LOGIN
        System.out.println("======LOGIN======");

        System.out.print("Enter username: ");
        String userName = input.nextLine();

        System.out.print("Enter password: ");
        String passWord = input.nextLine();

        System.out.println(" ");

        // LOGIN CHECK
        if (userName.equals(username)
                && passWord.equals(password)) {

            System.out.println("Welcome "
                    + firstName + " " + lastName + ".");

            // MESSAGE SECTION
            System.out.println("======MESSAGES======");

            // DECLARATIONS
            String recipient;
            String text;
            int choice;

            // USER INPUT
            System.out.print("Enter recipient number: ");
            recipient = input.nextLine();

            System.out.print("Enter your message: ");
            text = input.nextLine();

            // CHECK LENGTH
            if (text.length() > 250) {

                System.out.println("Message is too long.");
                return;
            }

            // OBJECT
            Message m = new Message(recipient, text);

            // SHOW MESSAGE
            m.showMessage();

            // MENU
            System.out.println("1. Send");
            System.out.println("2. Discard");
            System.out.println("3. Store");

            System.out.print("Choose option: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.println("Message successfully sent.");

            } else if (choice == 2) {

                System.out.println("Message discarded.");

            } else if (choice == 3) {

                System.out.println("Message stored.");

            } else {

                System.out.println("Invalid option.");
            }

        } else {

            System.out.println("Username or password has been entered incorrectly.");
        }
    }
}
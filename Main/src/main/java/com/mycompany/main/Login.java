/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin01
 */
import java.util.Scanner;
public class Login {

    // DECLARATIONS
    String username;
    String password;
    String cell;
    String firstName;
    String lastName;
    
    Scanner input = new Scanner(System.in);
    
    //Registration method
    public void registerUser()
    {
     System.out.println("=====REGISTRATION=====");
     
     // First name
     System.out.print("Enter first name: ");
     firstName = input.nextLine();

     // Last name
     System.out.print("Enter last name: ");
     lastName = input.nextLine();

     System.out.println(" ");

     // Username
     System.out.print("Enter username: ");
     username = input.nextLine();
     
     while(!checkUserName(username))
     {
         System.out.println("Username not correct formatted.");
         System.out.print("Re-enter useranme:");
         username = input.nextLine();
     }
     
     System.out.println("Username was successfully captured");
     
     //Password
     System.out.print("Enter password");
     password = input.nextLine();
     
     while(!checkPasswordComplexity(password))
     {
        System.out.println("Password not correctly formatted.");
        System.out.print("Re-enetr password");
        password = input.nextLine();
     }
     
     System.out.println("Password was successfully captured.");

    }
    //Cell number
    public void registerCellNumber()
    {
        System.out.print("Enter SA number(+27xxxxxxxxx):");
        cell = input.nextLine();
        
        while(!checkCellPhoneNumber(cell))
        {
            System.out.println("Cell number is incorrect.");
            System.out.print("Re-enter SA number:");
            cell = input.nextLine();
        }
        
        System.out.println("Cell number accepted");
    }
    
    //Login 
    public boolean loginUser()
    {
        System.out.println("=====Login=====");
        
        int tries = 3;
        
        while(tries > 0)
        {
            System.out.print("Enter username: ");
            String user = input.nextLine();
            
            System.out.print("Enter password: ");
            String pass = input.nextLine();
            
            if(user.equals(username) && pass.equals(password))
            {
                System.out.println("Welcome "+firstName+" "+lastName);
                return true;
            }
            
            tries--;
            System.out.println("Incorrect login. Attempts left: "+ tries);
        }
        
        return false;
    }

    // CHECK USERNAME
    public boolean checkUserName(String username) 
    {
        return username.contains("_") && username.length() <= 5;
    }

    // CHECK PASSWORD
    public boolean checkPasswordComplexity(String password) {

        boolean capital = false;
        boolean number = false;
        boolean special = false;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) 
        {
            char c = password.charAt(i);

            if(Character.isUpperCase(c)) capital = true;
            if(Character.isDigit(c)) number = true;
            if(!Character.isLetterOrDigit(c)) special = true;
        }

        return capital && number && special;
    }

    // CHECK CELLPHONE NUMBER
    public boolean checkCellPhoneNumber(String cell) {

        if (cell.matches("^\\+27\\d{9}$")) {

            return true;
        }

        return false;
    }
}
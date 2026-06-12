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
public class Message {

    String[] sentMessages = new String[50];
    String[] discardedMessage = new String[50];
    String[] storedMessages = new String[50];
    String[] messageHashes = new String[50];
    String[] messageIDs = new String[50];
    
    int sentCount = 0;
    int discardedCount = 0;
    int storeCount = 0;
    
    Scanner input = new Scanner(System.in);
    
    //Main menu for mesages
    public void messageMenu()
    {
        int choice = 0;
        
        while(choice !=5)
        {
            System.out.println("=====Message Menu=====");
            System.out.println("1. Send Message.");
            System.out.println("2. Discard Message.");
            System.out.println("3. Store Message.");
            System.out.println("4. Stored Messages Menu.");
            System.out.println("5. Exit.");
            
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();
            
            if(choice==1)
            {
                sendMessage();
            }else if(choice == 2)
            {
                discardMessage();
            }else if(choice == 3)
            {
                storeMessage();
            }else if(choice == 4)
            {
                storedMenu();
            }
        }
    }
    
    //Send Message
    public void sendMessage()
    {
        System.out.print("Enter message ID: ");
        messageIDs[sentCount] = input.nextLine();
        
        System.out.print("Enter Message: ");
        sentMessages[sentCount] = input.nextLine();
        
        if(sentMessages[sentCount].length() > 250)
        {
            System.out.println("Message is too long.");
            return;
        }
        
        messageHashes[sentCount] = createHash(sentMessages[sentCount]);
        
        System.out.println("Message sent.");
        
        sentCount++;
    }
    
    //Discard messages
    public void discardMessage()
    {
        System.out.print("Enter message");
        discardedMessage[discardedCount] = input.nextLine();
        
        System.out.println("Message Stored.");
        
        discardedCount++;
    }
    
    //Store Messages
    public void storeMessage()
    {
        System.out.println("Enter message to store: ");
        storedMessages[storeCount] = input.nextLine();
        
        System.out.println("Message stored.");
        
        storeCount++;
    }
    
    //Store Menu 
    public void storedMenu()
    {
        int option = 0;
        
        while(option !=5)
        {
            System.out.println("===== STORED MESSAGES =====");
            System.out.println("1. Show all messages");
            System.out.println("2. Longest message");
            System.out.println("3. Search by ID");
            System.out.println("4. Full report");
            System.out.println("5. Back");

            System.out.print("Choose: ");
            option = input.nextInt();
            input.nextLine();
            
             if (option == 1) 
            {
                showAll();

            } else if (option == 2) 
            {
                longestMessage();

            } else if (option == 3) 
            {
                searchByID();

            } else if (option == 4) 
            {
                fullReport();
            }
        }
    }
    
    //Show all
    public void showAll() 
    {

        for (int i = 0; i < sentCount; i++) {
            System.out.println(sentMessages[i]);
        }
    }
    
    // LONGEST MESSAGE
    public void longestMessage() 
    {

        String longest = "";

        for (int i = 0; i < storeCount; i++) 
        {
            if (storedMessages[i].length() > longest.length()) 
            {
                longest = storedMessages[i];
            }
        }

        System.out.println("Longest message: " + longest);
    }
    
    // SEARCH BY ID
    public void searchByID() 
    {

        System.out.print("Enter ID: ");
        String id = input.nextLine();

        for (int i = 0; i < sentCount; i++) 
        {

            if (messageIDs[i].equals(id)) 
            {
                System.out.println("Message: " + sentMessages[i]);
                return;
            }
        }

        System.out.println("Not found.");
    }
    
     // FULL REPORT
    public void fullReport() 
    {

        System.out.println("\n===== FULL REPORT =====");

        for (int i = 0; i < sentCount; i++) 
        {

            System.out.println("ID: " + messageIDs[i]);
            System.out.println("Message: " + sentMessages[i]);
            System.out.println("Hash: " + messageHashes[i]);
            System.out.println("-------------------");
        }
    }

    // HASH
    public String createHash(String message) 
    {

        String[] words = message.split(" ");
        return words[0].toUpperCase() + words[words.length - 1].toUpperCase();
    }
}
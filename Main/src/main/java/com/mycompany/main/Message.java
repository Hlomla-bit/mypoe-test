/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin01
 */
public class Message {

    String recipientNumber;
    String message;
    String messageHash;

    // CONSTRUCTOR
    public Message(String number, String text) {

        recipientNumber = number;
        message = text;

        messageHash = createHash();
    }

    // CREATE HASH
    public String createHash() {

        String[] words = message.split(" ");

        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        return firstWord.toUpperCase()
                + lastWord.toUpperCase();
    }

    // DISPLAY MESSAGE
    public void showMessage() {

        System.out.println("--- MESSAGE DETAILS ---");

        System.out.println("Recipient: "
                + recipientNumber);

        System.out.println("Message: "
                + message);

        System.out.println("Message Hash: "
                + messageHash);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Admin01
 */

public class Main {

    public static void main(String[] args) {

        // SCANNER AND OBJECT
        Login log = new Login();
        Message msg = new Message();
        
        //Registration
        log.registerUser();
        
        //South African cell number
        log.registerCellNumber();
        
        //Login
        if(log.loginUser())
        {
            //Messaging system
            msg.messageMenu();
        }
    }
}
        


       

       

        
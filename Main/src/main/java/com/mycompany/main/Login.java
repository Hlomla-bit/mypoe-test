/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin01
 */
public class Login {

    // DECLARATIONS
    String username;
    String password;
    String cell;

    // CHECK USERNAME
    public boolean checkUserName(String username) {

        if (username.contains("_")
                && username.length() <= 5) {

            return true;
        }

        return false;
    }

    // CHECK PASSWORD
    public boolean checkPasswordComplexity(String password) {

        boolean capital = false;
        boolean number = false;
        boolean special = false;

        if (password.length() < 8) {

            return false;
        }

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {

                capital = true;
            }

            if (Character.isDigit(c)) {

                number = true;
            }

            if (!Character.isLetterOrDigit(c)) {

                special = true;
            }
        }

        if (capital && number && special) {

            return true;
        }

        return false;
    }

    // CHECK CELLPHONE NUMBER
    public boolean checkCellPhoneNumber(String cell) {

        if (cell.matches("^\\+27\\d{9}$")) {

            return true;
        }

        return false;
    }
}
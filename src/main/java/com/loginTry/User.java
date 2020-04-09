package com.loginTry;

import java.util.regex.Pattern;

public class User {
    public boolean isValidUserCredentials(String sUsername, String sUserPassword) {

        //Regex For Password
        String PasswordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern passwordPattern = Pattern.compile(PasswordRegex);

        //Regex For User Name
        String UserRegex = "^[A-Z]{1}[A-Za-z]{3,}$";
        Pattern userPattern = Pattern.compile(UserRegex);

        if (sUsername.matches(String.valueOf(userPattern)) && sUserPassword.matches(String.valueOf(passwordPattern))) {
            return true;
        }
        return false;
    }
}

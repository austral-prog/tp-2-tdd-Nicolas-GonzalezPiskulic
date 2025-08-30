package com.tp2.password;

public class PasswordValidator {
    
    public static boolean isValid(String password) {
        // TODO: Implement password validation following TDD approach
        if (length(password) && number(password) && upcase(password) && lowcase(password) && special(password)){
            return true;
        }
        // Consider these criteria:
        // - Minimum 8 characters
        // - At least 1 uppercase letter
        // - At least 1 lowercase letter  
        // - At least 1 number
        // - At least 1 special character (!@#$%^&*()_+-=[]{}|;:,.<>?)
        return false;
    }
    public static boolean length(String password) {
        return !(password.length() < 8);
    }

    public static boolean number(String password) {
        for (Character c : password.toCharArray())
            if (Character.isDigit(c)) {
                return true;
            }
        return false;
    }

    public static boolean upcase (String password) {
        for (Character c : password.toCharArray())
            if (Character.isUpperCase(c)) {
                return true;
            }
        return false;
    }

    public static boolean lowcase (String password) {
        for (Character c : password.toCharArray())
            if (Character.isLowerCase(c)) {
                return true;
            }
        return false;
    }

    public static boolean special(String password) {
        for (Character c : password.toCharArray())
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        return false;
    }
}
package com.exercise1Solution;

public class UserAuthenticator {
    public static boolean authenticateUser(String username, String password) {
        return UserValidator.validateUsername(username) && UserValidator.validatePassword(password);
    }
}
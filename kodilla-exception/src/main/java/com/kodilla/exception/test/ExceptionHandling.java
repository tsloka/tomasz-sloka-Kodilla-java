package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyIWillThrowException(0.9999,1.5);
        } catch (Exception e) {
            System.out.println("Error occured: " + e);
        } finally {
            System.out.println("Program is still operational ;P");
        }
    }
}

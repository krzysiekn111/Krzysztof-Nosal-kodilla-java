package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.5, 5));
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
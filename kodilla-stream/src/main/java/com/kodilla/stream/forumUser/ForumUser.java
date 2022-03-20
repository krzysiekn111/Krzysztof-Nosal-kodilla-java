package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {
    private char gender;
    private LocalDate dateOfBith;
    private int numberPostsPublished;
    private int identifier;


    public ForumUser(int identifier, char gender, LocalDate dateOfBith, int numberPostsPublished) {
        this.identifier = identifier;
        this.gender = gender;
        this.dateOfBith = dateOfBith;
        this.numberPostsPublished = numberPostsPublished;
    }


    public int getIdentifier() {
        return identifier;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBith() {
        return dateOfBith;
    }

    public int getNumberPostsPublished() {
        return numberPostsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "gender: " + gender +
                ", dateOfBith: " + dateOfBith +
                ", numberPostsPublished: " + numberPostsPublished +
                '}';
    }
}

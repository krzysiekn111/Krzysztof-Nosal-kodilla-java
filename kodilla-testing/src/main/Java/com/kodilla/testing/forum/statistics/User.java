package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class User implements Statistics {
    String name;
    List<String> comments = new ArrayList<>();
    List<String> posts = new ArrayList<>();
    static List<String> users = new ArrayList<>();
    private static int commentsNumber = 0;
    private static int postsNumber = 0;
    private static int usersNumber = 0;

    User(String name) {
        this.name = name;
        users.add(name);
        usersNumber++;
    }


    public List<String> usersNames() {
        return users;
    }
    public int postsCount() {
        return postsNumber;
    }
    public int commentsCount() {
        return commentsNumber;
    }

    private void addPost(String post) {
        postsNumber++;
        posts.add(post);
    }
    private void addCommentary(String commentary) {
        commentsNumber++;
        comments.add(commentary);
    }
    public int usersPosts() {
        return posts.size();
    }
    public int usersCommentaries() {
        return comments.size();
    }
    private static double getAverageNumberOfPostPerUser() {
        return (double) postsNumber/usersNumber;
    }
    private static double getAverageNumberOfCommentsPerUser() {
        return (double) commentsNumber/usersNumber;
    }
    private static double getAverageNumberOfCommentsPerPost() {
        return (double) commentsNumber/postsNumber;
    }


    private int getNumberOfUsers() {
        return usersNumber;
    }


    public static void main(String[] args) {
        User adam = new User("adam");
        User ewa = new User("Ewa");
        adam.addPost("aaaaa");
        ewa.addCommentary("aa");
        ewa.addCommentary("bb");
        System.out.println(User.getAverageNumberOfCommentsPerPost());

    }
}
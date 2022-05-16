package com.kodilla.testing.forum.statistics;

import java.util.List;

public class User implements Statistics {
    String name;
    List<String> comments;
    List<String> posts;
    List<String> users;

    User(String name) {
        this.name = name;
        users.add(name);
    }


    @Override
    public List<String> usersNames() {
        return users;
    }

    public int postsCount() {
        return posts.size();
    }
    void addPost(User user, String post) {
        posts.add(post);
    }
    public int getNumberOfPostsPerUser(User user) {
        return posts.size();
    }
    private int getAverageNumberOfPostPerUser() {
        return postsCount()/users.size();
    }

    private void addCommentary(User user, String commentary) {
        comments.add(commentary);
    }
    public int getNumberOfCommentsPerUser(User user, int number) {
        return comments.size();
    }
    public int commentsCount() {
        return comments.size();
    }
    private int getAverageNumberOfCommentsPerUser() {
        return commentsCount()/users.size();
    }

    private int getNumberOfUsers() {
        return users.size();
    }
    public static void main(String[] args) {
        User adam = new User("adam");
        System.out.println("--------------" + "\n" + adam.name + "\n"+ "--------------" );


    }
}

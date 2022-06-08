package com.kodilla.testing.forum.statistics;

public class Post {
    User user;
    String post;

    public Post(User user, String post) {
        this.user = user;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Post{" +
                "user=" + user.name +
                ", post='" + post.toString() + '\'' +
                '}';
    }
}

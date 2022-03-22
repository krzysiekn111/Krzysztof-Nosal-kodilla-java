package com.kodilla.stream.forumUser;

import java.util.List;

public class Forum {
    public Forum(List<ForumUser> forumUsers) {
        this.forumUsers = forumUsers;
    }

    public List<ForumUser> forumUsers;

    public List<ForumUser> getUserList() {
        return forumUsers;
    }
}

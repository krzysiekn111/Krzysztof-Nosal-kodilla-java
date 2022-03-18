package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public Forum(List<ForumUser> forumUsers) {
        this.forumUsers = forumUsers;
    }

    public List<ForumUser> forumUsers = new ArrayList<>();

    public List<ForumUser> getUserList() {
        return forumUsers;
    }
}

package com.kodilla.stream.immutable;

public class ForumUser {
    private final String realName = "";
    private final String userName = "";

    private ForumUser(String userName, String realName) {
    }

    final private String getUserName() {
        return userName;
    }

    private final String getRealName() {
        return realName;
    }
}

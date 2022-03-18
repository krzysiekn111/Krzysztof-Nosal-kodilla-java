package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String realName;
    private final String userName;

    private ForumUser(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;

    }

    final private String getUserName() {
        return userName;
    }

    private final String getRealName() {
        return realName;
    }
}

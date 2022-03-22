package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.forumUser.Forum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        ForumUser forumUser1 = new ForumUser(1, 'M', LocalDate.
                of(1990, 9, 20 ), 2);
        ForumUser forumUser2 = new ForumUser(2, 'K', LocalDate.
                of(2005, 3, 27 ), 1);
        ForumUser forumUser3 = new ForumUser(3, 'M', LocalDate.
                of(1998, 5, 30 ), 6);
        ForumUser forumUser4 = new ForumUser(4, 'M', LocalDate.
                of(2001, 7, 13 ), 3);
        ForumUser forumUser5 = new ForumUser(5, 'M', LocalDate.
                of(2003, 8, 17 ), 6);
        ForumUser forumUser6 = new ForumUser(6, 'K', LocalDate.
                of(1998, 12, 9 ), 0);

        List<ForumUser> forumUsers = new ArrayList<>();
        forumUsers.add(forumUser1);
        forumUsers.add(forumUser2);
        forumUsers.add(forumUser3);
        forumUsers.add(forumUser4);
        forumUsers.add(forumUser5);
        forumUsers.add(forumUser6);

        Forum forum = new Forum(forumUsers);
        LocalDate theMoment = LocalDate.now().minusYears(20);

        Map<Integer, String > par = forum.getUserList().stream()
                .filter(user -> user.getGender() =='M')
                .filter(user -> user.getDateOfBith().getYear()<theMoment.getYear())
                .filter(user -> user.getNumberPostsPublished()>0)
                .collect(Collectors.toMap(ForumUser::getIdentifier, ForumUser::toString));

        par.entrySet().stream().
                forEach(System.out::println);

    }
}
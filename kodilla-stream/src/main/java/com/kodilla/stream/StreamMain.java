package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Gender;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> users = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.of(1999, 06, 26)))
                .filter(forumUser -> forumUser.getGender().equals(Gender.M))
                .filter(forumUser -> forumUser.getUserPostCount() > 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# of forum users fulfilling criteria:" + users.size());
        users.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
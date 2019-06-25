package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final Gender gender;
    private final LocalDate birthDate;
    private final int userPostCount;

    public ForumUser(int id, String userName, Gender gender, LocalDate birthDate, int userPostCount) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.userPostCount = userPostCount;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getUserPostCount() {
        return userPostCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", userPostCount=" + userPostCount +
                '}';
    }
}

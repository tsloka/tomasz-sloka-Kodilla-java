package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser(0001, "Greg0022", Gender.MALE,
                LocalDate.of(1995,05,24), 5));
        theUserList.add(new ForumUser(0002, "Anna0022", Gender.FEMALE,
                LocalDate.of(2001,07,24), 3));
        theUserList.add(new ForumUser(0003, "Ag234", Gender.FEMALE,
                LocalDate.of(1995,07,24), 11));
        theUserList.add(new ForumUser(0004, "Greg062", Gender.MALE,
                LocalDate.of(1999,06,26), 2));
        theUserList.add(new ForumUser(0005, "G6eg0022", Gender.MALE,
                LocalDate.of(1995,07,24), 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<> (theUserList);
    }
}

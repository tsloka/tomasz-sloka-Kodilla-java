package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements MentorObserver {
    private String name;
    private List<ExcersizeQueue> mentorQueues;
    private int updates;

    public Mentor(String name) {
        this.name = name;
        mentorQueues = new ArrayList<>();
        updates = 0;
    }

    @Override
    public void updateQueue(ExcersizeQueue queue) {
        System.out.println(name + " has an excersize for checkout in queue: " + queue);
        updates++;
    }

    public List<ExcersizeQueue> getMentorQueues() {
        return mentorQueues;
    }

    public int getUpdates() {
        return updates;
    }
}

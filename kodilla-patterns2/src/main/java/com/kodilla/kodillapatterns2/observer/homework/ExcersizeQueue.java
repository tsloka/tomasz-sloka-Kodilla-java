package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class ExcersizeQueue implements ExcersizeObservable {
    private List<MentorObserver> mentors;
    private List<Excersize> excersizes;
    private String name;

    public ExcersizeQueue(String name) {
        this.name = name;
        mentors = new ArrayList<>();
        excersizes = new ArrayList<>();
    }

    public void addExcersize(Excersize excersize) {
        excersizes.add(excersize);
        notifyMentor();
    }

    @Override
    public void registerMentor(MentorObserver mentor) {
        mentors.add(mentor);
    }

    @Override
    public void notifyMentor() {
        for (MentorObserver mentor : mentors) {
            mentor.updateQueue(this);
        }
    }

    @Override
    public void deleteMentor(MentorObserver mentor) {
        mentors.remove(mentor);
    }

}
package com.kodilla.kodillapatterns2.observer.homework;

public interface ExcersizeObservable {
    void registerMentor(MentorObserver mentor);
    void notifyMentor();
    void deleteMentor(MentorObserver mentor);
}

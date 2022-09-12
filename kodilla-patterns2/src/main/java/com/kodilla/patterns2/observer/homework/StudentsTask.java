package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class StudentsTask implements ObservableHomework {
    private final List<MentorObserver> observers;

    public String getName() {
        return name;
    }


    private final String name;
    public StudentsTask(String name) {
        observers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        messages.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(MentorObserver mentorObserver) {
        observers.add(mentorObserver);
    }

    @Override
    public void notifyMentors() {
        for (MentorObserver mentorObserver : observers) {
            mentorObserver.update(this);
        }

    }

    @Override
    public void removeMentor(MentorObserver mentorObserver) {
        observers.remove(mentorObserver);
    }

    public List<String> getMessages() {
        return messages;
    }

    private final List<String> messages;
}

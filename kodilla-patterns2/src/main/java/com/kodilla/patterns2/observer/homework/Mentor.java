package com.kodilla.patterns2.observer.homework;


public class Mentor implements MentorObserver {
    private final String mentorName;

    private int updateCount;
    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentsTask studentsTask) {
        System.out.println(mentorName + ": New tasks for students Task: " + studentsTask.getName() + "\n" +
                " (total: " + studentsTask.getMessages().size() + " tasks)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

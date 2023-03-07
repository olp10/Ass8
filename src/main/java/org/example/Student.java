package org.example;

public class Student extends User {
    private boolean feePaid;

    public boolean isFeePaid() {
        return feePaid;
    }

    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }

    public Student(String name, boolean feePaid) {
        super(name);
        this.feePaid = feePaid;
    }
}

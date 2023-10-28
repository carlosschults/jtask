package org.example;

import java.time.LocalDate;

public class Task {
    private String description;
    private boolean isComplete;
    private LocalDate dueDate;
    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public Task(String description, LocalDate dueDate) {
        this.description = description;
        this.isComplete = false;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void complete() {
        isComplete = true;
    }

    public void postponeByDays(int days) {
        if (dueDate == null) return;

        if (days < 0)
            throw new IllegalArgumentException("The number of days must be positive!");

        dueDate = dueDate.plusDays(days);
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}


package org.example.model;

import java.time.LocalDateTime;

public class ToDoItem {
    // todo
    private int id;
    private String title;
    private String description;
    private LocalDateTime deadLine;
    private boolean done;
    private People assignee;

    public ToDoItem(String title, String description, LocalDateTime deadLine, boolean done, People assignee) {
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.done = done;
        this.assignee = assignee;
    }

    public ToDoItem(int id, String title, String description, LocalDateTime deadLine, boolean done, People assignee) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.done = done;
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDeadLine() {
        return deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public People getAssignee() {
        return assignee;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", assignee=" + assignee +
                '}';
    }
}

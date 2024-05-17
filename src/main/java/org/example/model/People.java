package org.example.model;

import java.util.List;

public class People {
    private int id;
    private String firstName;
    private String lastName;
    private List<ToDoItem> toDoItems;

    // User

    public People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // Database

    public People(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<ToDoItem> getToDoItems() {
        return toDoItems;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", toDoItems=" + toDoItems +
                '}';
    }

    // Create help method
    public int findById(int id){
        // todo
        return 0;
    }
}

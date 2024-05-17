package org.example.dao.queries;

public class ToDoItemQueries {
    public static final String CREATE = "INSERT INTO todo_item (title, description, deadline, done, assignee_id) VALUES (?, ?, ?, ?, ?)";
    public static final String UPDATE = "UPDATE todo_item SET title = ?, description = ?, deadline = ?, done = ?, assignee_id = ? WHERE todo_id = ?";
    public static final String DELETE = "DELETE FROM todo_item WHERE todo_id = ?";
    public static final String FIND_ALL = "SELECT * FROM todo_item";
    public static final String FIND_BY_ID = "SELECT * FROM todo_item WHERE todo_id = ?";
    public static final String FIND_BY_DONE_STATUS = "SELECT * FROM todo_item WHERE done = ?";
    public static final String FIND_BY_ASSIGNEE_ID = "SELECT * FROM todo_item WHERE assignee_id = ?";
    public static final String FIND_BY_ASSIGNEE_PEOPLE = "SELECT * FROM todo_item INNER JOIN person ON todo_item.assignee_id = person.person_id";
    public static final String FIND_BY_UNASSIGNED = "SELECT * FROM todo_item WHERE assignee_id IS NULL";
}

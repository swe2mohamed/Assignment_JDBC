package org.example.dao.impl;

import org.example.dao.ToDoItemDao;
import org.example.dao.db.DatabaseConnector;
import org.example.dao.exception.DBConnectionException;
import org.example.dao.queries.PeopleQueries;
import org.example.dao.queries.ToDoItemQueries;
import org.example.model.People;
import org.example.model.ToDoItem;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ToDoItemImpl implements ToDoItemDao {

    @Override
    public ToDoItem create(ToDoItem toDoItem) {
        // todo:
        return null;
    }

    @Override
    public ToDoItem updateTodoItem(ToDoItem toDoItem) {
        // todo:
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        // todo:
        return false;
    }

    @Override
    public Collection<ToDoItem> findAll() {
        List<ToDoItem> toDoItems = new ArrayList<>();
        try(
                Connection connection = DatabaseConnector.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(PeopleQueries.FIND_ALL)

        ){
                while (resultSet.next()){
                    int todo_id = resultSet.getInt(1);
                    String title = resultSet.getString(2);
                    String description = resultSet.getString(3);
                    LocalDate deadline = resultSet.getDate(4).toLocalDate();
                    boolean done = resultSet.getBoolean(5);
                    int assignee_id = resultSet.getInt(6);

                    // People assignee = findById(assignee_id);
                }
        }catch (SQLException e){
            throw new DBConnectionException(e.getMessage());
        }
        return toDoItems;
    }

    @Override
    public Optional<ToDoItem> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Collection<ToDoItem> findByDoneStatus(boolean done) {
        return null;
    }

    @Override
    public Collection<ToDoItem> findByAssignee(int id) {
        return null;
    }

    @Override
    public Collection<ToDoItem> findByAssignee(People assignee) {
        return null;
    }

    @Override
    public Collection<ToDoItem> findByUnassignedTodoItem() {
        return null;
    }

}

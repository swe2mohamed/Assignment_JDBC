package org.example.dao.impl;

import org.example.dao.ToDoItemDao;
import org.example.model.People;
import org.example.model.ToDoItem;

import java.util.Collection;
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
        return null;
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

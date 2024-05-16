package org.example.dao;

import org.example.model.People;
import org.example.model.ToDoItem;

import java.util.Collection;
import java.util.Optional;

public interface ToDoItemDao {

    /**
     * Create a new  ToDoItem.
     * @param toDoItem the to-do item to create.
     * @return the created to-do item.
     */
    ToDoItem create(ToDoItem toDoItem);

    /**
     * Update an existing ToDoItem.
     * @param toDoItem the to-do item to update.
     * @return the update to-do item.
     */
    ToDoItem updateTodoItem(ToDoItem toDoItem);

    /**
     * Delete a ToDoItem by its ID.
     * @param id the ID to-do item.
     * @return ture if the to-do item as delete, false otherwise.
     */
    boolean deleteById(int id);

    /**
     * Find all ToDoItem.
     * @return a collection all to-do items.
     */
    Collection<ToDoItem> findAll();

    /**
     * Find ToDoItem by its ID.
     * @param id the ID of to-do item.
     * @return an Optional containing the found to-do item, or empty if not found.
     */
    Optional<ToDoItem> findById(int id);

    /**
     * Find ToDoItem by there done status.
     * @param done the done status to-do item.
     * @return a collection of to-do items with specified done status.
     */
    Collection<ToDoItem> findByDoneStatus(boolean done);

    /**
     * Find ToDoItem by ID of person assignee to them.
     * @param id the ID of assignee.
     * @return a collection of to-do items assignee to specified person.
     */
    Collection<ToDoItem> findByAssignee(int id);

    /**
     * Find ToDoItem by person assignee to them.
     * @param assignee the assignee object.
     * @return a collection of to-do items assigned to the specified person.
     */
    Collection<ToDoItem> findByAssignee(People assignee);

    /**
     * Find ToDoItem that are unassigned.
     * @return a collection of unassigned to-do items.
     */
    Collection<ToDoItem> findByUnassignedTodoItem();

}

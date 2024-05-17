package org.example.dao.queries;

public class PeopleQueries {

    public static final String CREATE = "INSERT INTO person (first_name, last_name) VALUES (?, ?)";
    public static final String UPDATE = "UPDATE person SET first_name = ?, last_name = ? WHERE person_id = ?";
    public static final String DELETE = "DELETE FROM person WHERE person_id = ?";
    public static final String FIND_ALL = "SELECT * FROM person";
    public static final String FIND_BY_ID = "SELECT * FROM person WHERE person_id = ?";
    public static final String FIND_BY_NAME = "SELECT * FROM person WHERE first_name = ? AND last_name = ?";
}

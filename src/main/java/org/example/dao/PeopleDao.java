package org.example.dao;

import org.example.model.People;

import java.util.Collection;
import java.util.Optional;

public interface PeopleDao {

    /**
     * Create new person.
     * @param person the person to create.
     * @return the created person.
     */
    People createPerson(People person);

    /**
     * Update an exiting Person.
     * @param person the person to update.
     * @return the update person.
     */
    People updatePerson(People person);

    /**
     * Delete a Person by ID.
     * @param id the ID of the person.
     * @return true if the person was deleted , false otherwise.
     */
    boolean deletePerson(int id);

    /**
     * Find all people.
     * @return a collection of all people.
     */
    Collection<People> findAll();

    /**
    * Find a person by ID.
     * @param id the ID of the person.
     * @return an Optional containing the found person, or empty if not found.
     */
    Optional<People> findById(int id);

    /**
     * Find a person by first and last name.
     * @param first_name the first name of the person.
     * @param last_name the last name of the person.
     * @return an Optional containing the found person, or empty if not found.
     */
    Optional<People> findByName(String first_name, String last_name);

}

package org.example.dao.impl;

import org.example.dao.PeopleDao;
import org.example.model.People;

import java.util.Collection;
import java.util.Optional;

public class PeopleDaoImpl implements PeopleDao {

    @Override
    public People createPerson(People person) {
        return null;
    }

    @Override
    public Collection<People> findAll() {
        return null;
    }

    @Override
    public Optional<People> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<People> findByName(String firstName, String lastName) {
        return Optional.empty();
    }

    @Override
    public People updatePerson(People person) {
        return null;
    }

    @Override
    public boolean deletePerson(int id) {
        return false;
    }
}

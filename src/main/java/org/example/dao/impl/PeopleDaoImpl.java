package org.example.dao.impl;

import org.example.dao.PeopleDao;
import org.example.model.People;

import java.util.Collection;
import java.util.Optional;

public class PeopleDaoImpl implements PeopleDao {

    @Override
    public People createPerson(People person) {
        // todo:
        return null;
    }

    @Override
    public People updatePerson(People person) {
        // todo:
        return null;
    }

    @Override
    public boolean deletePerson(int id) {
        // todo:
        return false;
    }

    @Override
    public Collection<People> findAll() {
        // todo: find
        return null;
    }

    @Override
    public Optional<People> findById(int id) {
        // todo: find
        return Optional.empty();
    }

    @Override
    public Optional<People> findByName(String firstName, String lastName) {
        // todo: find
        return Optional.empty();
    }

}

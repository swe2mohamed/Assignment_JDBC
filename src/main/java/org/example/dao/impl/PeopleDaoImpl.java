package org.example.dao.impl;

import org.example.dao.PeopleDao;
import org.example.dao.db.DatabaseConnector;
import org.example.dao.exception.DBConnectionException;
import org.example.dao.queries.PeopleQueries;
import org.example.model.People;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


public class PeopleDaoImpl implements PeopleDao {


    @Override
    public People createPerson(People person) {
        // todo:
        /*
        try(
                Connection connection = DatabaseConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(PeopleQueries.CREATE);
                ){
            preparedStatement.setString(1, "first_name");
            preparedStatement.setString(2, "last_name");

            int affectedRows = preparedStatement.executeUpdate();
            try(
                    ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                    ){

            }

        }catch (SQLException e){

        }

         */
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
        List<People> people = new ArrayList<>();
        try(
                Connection connection = DatabaseConnector.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(PeopleQueries.FIND_ALL);
                ){
            while (resultSet.next()){
                int personId = resultSet.getInt("person_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                People person = new People(personId, firstName, lastName);
                people.add(person);
            }
        }catch (SQLException e){
            throw new DBConnectionException(e.getMessage());
        }
        return people;
    }

    @Override
    public Optional<People> findById(int id) {
        try(
                Connection connection = DatabaseConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(PeopleQueries.FIND_BY_ID);
                ){
            preparedStatement.setInt(1,id);
            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
                    ){
                if (resultSet.next()){
                    int personId = resultSet.getInt("person_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");

                    People foundPerson = new People(personId, firstName, lastName);
                    return Optional.of(foundPerson);
                }else{
                    return Optional.empty();
                }
            }
        }catch (SQLException e){
            throw new DBConnectionException(e.getMessage());
        }
    }

    @Override
    public Optional<People> findByName(String first_name, String last_name) {
        try (
                Connection connection = DatabaseConnector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(PeopleQueries.FIND_BY_NAME);
                ){
            preparedStatement.setString(1, first_name);
            preparedStatement.setString(2, last_name);
            try (
                    ResultSet resultSet = preparedStatement.executeQuery();
                    ){
                if (resultSet.next()){
                    int personId = resultSet.getInt(1);
                    String firstName = resultSet.getString(2);
                    String lastName = resultSet.getString(3);

                    People foundPerson = new People(personId, firstName, lastName);
                    return Optional.of(foundPerson);
                }else{
                    return Optional.empty();
                }
            }
        }catch (SQLException e){
            throw new DBConnectionException(e.getMessage());
        }
    }

}

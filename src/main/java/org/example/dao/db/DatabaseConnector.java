package org.example.dao.db;

import org.example.dao.exception.DBConnectionException;
import org.example.dao.exception.MySQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String DB_NAME = "todoit";
    private static final String JDBC_URL = "dbc:mysql://localhost/todoit";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "password";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection =  DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        }catch (SQLException e){
            throw new DBConnectionException("Failed to connect to DB(" + DB_NAME + ")");
        }
        return connection;
    }
}

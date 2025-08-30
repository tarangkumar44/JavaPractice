/*
🔹 Objective:
Write a Java program using JDBC (with SQLite) to:
Load the JDBC driver explicitly (even if optional in modern Java).
Establish a connection to a database named company.db.

Create a table employees with the following columns:
id (INTEGER, PRIMARY KEY, AUTOINCREMENT)
name (TEXT, NOT NULL)
designation (TEXT)
salary (REAL)

Make sure the code:
Uses try-with-resources for closing resources cleanly.
Checks if table creation was successful (optional: print a success message).
Handles exceptions in a professional manner. 
*/

import java.sql.*;

public class SQLiteDatabaseTableCreatorDemo {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:company.db";
            try (Connection connection = DriverManager.getConnection(url);
                 Statement statement = connection.createStatement()) {
                    String command = """
                                    CREATE TABLE IF NOT EXISTS employees (
                                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                                        name TEXT NOT NULL,
                                        designation TEXT,
                                        salary REAL
                                    )
                                """;
                    statement.executeUpdate(command);
                    System.out.println("Table created successfully..");
            } catch (SQLException e) {
                System.err.println("Error creating table: " + e.getMessage());
            }
        } catch (ClassNotFoundException e){
            System.err.println("Class not available: " + e.getMessage());
        } 
    }
}

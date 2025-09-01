/*
Task:
Write a Java program that:
Connects to company.db.
Inserts at least 3 employees into the employees table using a PreparedStatement.

Example data:
("Alice", "Developer", 75000)
("Bob", "Manager", 90000)
("Charlie", "Tester", 50000)

Use parameterized queries (?) to avoid SQL injection.
Use try-with-resources.
Print the number of rows inserted.

🧪 Test Tip: After running, verify with an SQLite tool that rows are actually inserted.
*/

import java.sql.*;
import java.util.*;

class Choice {
    public void showMenu(Scanner scanner, Connection connection){
        int choice = 0;
        do {
            System.out.println("___________________________________");
            System.out.println("1). Insert record");
            System.out.println("0). Exit");
            System.out.println("------------------------------");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("------------------------------");
            switch (choice) {
                case 0:
                    System.out.println("Exiting..");
                    break;

                case 1:
                    insertRecord(scanner, connection);                 
                    break;
            
                default:
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Enter valid input(0 or 1).");
                    System.out.println("++++++++++++++++++++++++++++++");
                    break;
            }
        } while (choice != 0); 
    }
    private void insertRecord(Scanner scanner, Connection connection) {
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter salary: ");
        float salary = scanner.nextFloat();
        scanner.nextLine(); // consume leftover newline

        String sql = "INSERT INTO employees(name, designation, salary) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, employeeName);
            statement.setString(2, designation);
            statement.setFloat(3, salary);
            int rows = statement.executeUpdate();
            System.out.println("========================================");
            System.out.println(rows + " record inserted successfully.");
            System.out.println("========================================");
        } catch (SQLException e) {
            System.err.println("Error inserting record: " + e.getMessage());
        }
    }
}

public class SQLiteEmployeeInserterDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:company.db";
        try (Scanner scanner = new Scanner(System.in);
             Connection connection = DriverManager.getConnection(url)) {
                Choice choice = new Choice();
                choice.showMenu(scanner, connection);
        } catch (SQLException e) {
            System.out.println("Driver error: " + e.getMessage());
        }
    }
}

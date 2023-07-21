package module02.Jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Jdbc02App {
    public static final String createTableUserSql = "CREATE TABLE Users\n" +
            "(\n" +
            "    id serial primary key ,\n" +
            "    name varchar(20),\n" +
            "    email varchar(20),\n" +
            "    phoneNumber numeric\n" +
            ");\n";
    public static final String insertIntoUsersSql = "INSERT INTO Users (name, email, phoneNumber)\n" +
            "VALUES (?, ?, ?);";

    public static final String getAllUsers = "SELECT * FROM Users;";

    public static void main(String[] args) {

        //createTableUser();

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String email = sc.next();
        long phoneNumber = sc.nextLong();
        insertIntoUsers(new User(name, email, phoneNumber));

        getAllUsers().forEach(System.out::println);

    }

    private static List<User> getAllUsers() {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mysecretpassword")) {
            PreparedStatement preparedStatement = conn.prepareStatement(getAllUsers);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                long phoneNumber = resultSet.getLong("phoneNumber");

                users.add(new User(id, name, email, phoneNumber));
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private static void createTableUser() {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mysecretpassword")) {
            PreparedStatement preparedStatement = conn.prepareStatement(createTableUserSql);
            ResultSet resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertIntoUsers(User user) {
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "mysecretpassword")) {
            PreparedStatement preparedStatement = conn.prepareStatement(insertIntoUsersSql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setLong(3, user.getPhoneNumber());
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

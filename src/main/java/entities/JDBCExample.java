package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Andrii on 9/4/2015.
 */
public class JDBCExample {
    public static void main(String[] args){
        System.out.println("PostgreSQL JDBC connection testing");
        try {
            Class.forName("org.postgreSQL.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL Driver?" + "Include in your library path");
            e.printStackTrace();
            return;
        }
        System.out.println("PostgreSQL Driver Registered");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/firstDB", "postgres",
                    "234786");
        } catch (SQLException e) {
            System.out.println("Connection is failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null){
            System.out.println("You made it! Take control your databese now");
        }else {
            System.out.println("Failed to make connection");
        }

    }
}

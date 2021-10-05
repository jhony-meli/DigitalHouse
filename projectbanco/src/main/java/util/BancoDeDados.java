package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    private static Connection conn;

    public static Connection getConection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancodedados?serverTimezone=UTC", "root", "");
        return conn;
    }
}
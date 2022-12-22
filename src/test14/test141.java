package test14;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static test14.test14.connection;

public class test141 {
    public static void main() throws SQLException {
    Statement statement = connection.createStatement();
    ResultSet res = statement.executeQuery("Show tables;");
    System.out.println("Таблицы из текущей базы данных: ");
    while (res.next()) {
        System.out.println(res.getString(1));
    }
}
}


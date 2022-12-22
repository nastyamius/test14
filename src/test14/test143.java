package test14;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class test143 extends test14{
    public static void main() throws SQLException {
        Listic2 a = new Listic2();

        String query3 = "INSERT INTO " + tablename + " (id, listok1, listok2) VALUES (?,?,?);";
        PreparedStatement statement3 = connection.prepareStatement(query3);
        statement3.setInt(1, i);
        statement3.setString(2, String.valueOf(a.input()));
        statement3.setString(3, String.valueOf(a.random()));
        statement3.executeUpdate();
        i++;

        ResultSet result3 = statement3.executeQuery("SELECT * from " + tablename + ";");
        System.out.println("Ведённые данные:");
        while (result3.next()) {
            System.out.print(Arrays.toString(result3.getString(1).split(" ")));
            System.out.print(Arrays.toString(result3.getString(2).split(" ")));
            System.out.print(Arrays.toString(result3.getString(3).split(" ")));
            System.out.println();
        }
    }
}

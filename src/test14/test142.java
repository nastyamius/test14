package test14;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class test142 extends test14 {
    public static void main() throws SQLException {
        System.out.println("Введите название таблицы для создания: ");
        tablename = scan.nextLine();

        Statement statement2 = connection.createStatement();
        String query2 = "CREATE TABLE IF NOT EXISTS " + tablename +" (id VARCHAR(255),listok1 text(255),listok2 text(255));";
        statement2.executeUpdate(query2);

        System.out.println("Таблица создана.");
        ResultSet result_after_all = statement2.executeQuery("SHOW TABLES;");
        System.out.println("Таблицы в базе данных: ");
        while (result_after_all.next()) {
            System.out.print(result_after_all.getString(1));
            System.out.println();
        }
    }
}

package test14;

import java.sql.SQLException;
import java.sql.Statement;

public class test145 extends test14{
    public static void main() throws SQLException {
        System.out.println("Введите название файла с расширением: ");
        String file = scan.nextLine();
        Statement statement7 = connection.createStatement();
        String query7 = "SELECT 'ID', 'STROKA', 'SET' UNION ALL SELECT * FROM " + tablename + " INTO OUTFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/" + file + "' CHARACTER SET cp1251 ";
        statement7.executeQuery(query7);
        System.out.println("Данные успешно эксплоатированы!");
    }
}

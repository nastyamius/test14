package test14;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class test144 extends test14{
    public static void main() throws SQLException {
        System.out.println("введите айди для удаления:");
        int idd = scan.nextInt();

        String query5 = "SET SQL_SAFE_UPDATES=0 ";
        String query6 = "DELETE FROM " + tablename + " WHERE id ='" + idd + "';";
        String query7 = "SET SQL_SAFE_UPDATES=1 ";
        PreparedStatement statement5 = connection.prepareStatement(query5);
        PreparedStatement statement6 = connection.prepareStatement(query6);
        PreparedStatement statement7 = connection.prepareStatement(query7);
        statement5.executeUpdate();
        statement6.executeUpdate();
        statement7.executeUpdate();
        scan.nextLine();

        ResultSet result5 = statement6.executeQuery("SELECT * from " + tablename + ";");
        System.out.println("данные:");
        while (result5.next()) {
            System.out.print(Arrays.toString(result5.getString(1).split(" ")));
            System.out.print(Arrays.toString(result5.getString(2).split(" ")));
            System.out.print(Arrays.toString(result5.getString(3).split(" ")));
            System.out.println();
        }
    }
}

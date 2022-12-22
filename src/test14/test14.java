package test14;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class test14 {
    protected static Scanner scan = new Scanner(System.in);
    protected static String tablename;
    protected static String mysqlUrl = "jdbc:mysql://localhost:3306/mysql";
    protected static Connection connection;
    protected static int i;
    static Listik l = new Listik();
    static{
        try{
            connection = DriverManager.getConnection(mysqlUrl, "n", "12345");
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws SQLException {
        int x = 0;
        String s = "";
        while (!"6".equals(s)) {
            System.out.println("1. Вывести все таблицы из MySQL");
            System.out.println("2. Создать таблицу в MySQL");
            System.out.println("3. Ввести список и сохранить в MySQL..");
            System.out.println("4. Удалить элемент из списка в MySQL по ID.");
            System.out.println("5. Сохранить итоговые результаты из MySQL в Excel и вывести их в консоль.");
            System.out.println("6. Выход");
            s = scan.nextLine();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println(s);
                System.out.println("Неверный формат ввода!");
            }
            switch (x) {
                case 1 -> {
                    test141.main();
                }
                case 2 -> {
                    test142.main();
                }
                case 3 -> {
                    test143.main();
                }
                case 4 -> {
                    test144.main();
                }
                case 5 -> {
                    test145.main();
                }
                case 6 -> {
                    System.out.println("Выход из программы...");
                }
            }
        }
    }
}


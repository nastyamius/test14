package test14;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Listik {

    public ArrayList<Integer> random() {
        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            Random r = new Random();
            int a = r.nextInt(100) + 1;
            mas.add(a);
        }
        return mas;
    }

    public ArrayList<String> input() {
        ArrayList<String> mas1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("введите число:");
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            mas1.add(a);
        }
        return mas1;
    }

    public static void main(String[] args) {
        Listik l = new Listik();
        ArrayList<String> mas=l.input();
        System.out.println(mas);
        ArrayList<Integer> mas1=l.random();
        System.out.println(mas1);

    }
}
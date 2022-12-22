package test14;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Listic2 {

    public ArrayList<Integer> random() {
        ArrayList<Integer> mas = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            Random r = new Random();
            int a = r.nextInt(100) + 1;
            mas.add(a);
        }
        return mas;
    }

    public ArrayList<Integer> input() {
        ArrayList<Integer> mas1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("введите кол-во чисел");
        int kolvo = scan.nextInt();
        System.out.println("введмте min границу");
        int ng = scan.nextInt();
        System.out.println("введите max границу");
        int vg = scan.nextInt();
        for (int i = 1; i <= kolvo; i++) {
            System.out.println("введите число:");
            Integer a = scan.nextInt();
            if (a > ng & a < vg) {
                mas1.add(a);
            }else{
                System.out.println("число вне границ");
            }
        }
        return mas1;
    }

    public static void main(String[] args) {
        Listik l = new Listik();
        ArrayList<String> mas = l.input();
        System.out.println(mas);
        ArrayList<Integer> mas1 = l.random();
        System.out.println(mas1);

    }
}
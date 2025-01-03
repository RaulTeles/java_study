package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import Rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();
        x.Area();
        x.Perimeter();
        x.Diagonal();

        System.out.println(x.toString());


    }
}
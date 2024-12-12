package entities;

import java.util.Scanner;

public class Triangulo {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    public double area(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p  * (p - a )*(p - b) * (p - c));
    }

}
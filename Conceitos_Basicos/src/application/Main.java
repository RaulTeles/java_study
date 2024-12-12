package application;


import entities.Triangulo;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        double areaX = x.area();
        double areaY = y.area();

        if (areaX > areaY){
            System.out.println("Area X é maior que a Area Y");
        }else {
            System.out.println("Area Y é maior que a Area X");
        }

        System.out.printf("AreaX %.1f", areaX);
        System.out.printf("AreaY %.1f", areaY);
    }
}
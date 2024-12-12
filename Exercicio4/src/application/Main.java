package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student1;
        student1 = new Student();

        System.out.print("Enter your name: ");
        student1.name = sc.nextLine();
        System.out.println("Enter your three notes: ");
        student1.note1 = sc.nextDouble();
        student1.note2 = sc.nextDouble();
        student1.note3 = sc.nextDouble();

        student1.CalcNote();


    }
}
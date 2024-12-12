package application;

import java.util.Locale;
import java.util.Scanner;
import Funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Enter the Tax: ");
        double tax = sc.nextDouble();

        Funcionario func1 = new Funcionario(name,grossSalary,tax);

        func1.setName("Raul Teles");
        System.out.println("Update name: "+ func1.getName());
        func1.setGrossSalary(2700);
        System.out.println("Update Groos Salary: " + func1.getGrossSalary());

        System.out.println(func1.toString());

        System.out.print("What percentage to increase salary? ");
        double percentage = sc.nextDouble();
        func1.increaseSalary(percentage);
        System.out.print("Update data: "+ func1.toString());



    }
}
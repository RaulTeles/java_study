import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.nio.file.DirectoryIteratorException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n;i++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or compony (i/c)? ");
            char op = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (op == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name,anualIncome,healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name,anualIncome,numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer taxPayer : list){
            System.out.println(taxPayer.getName()+": $ "+String.format("%.2f" ,taxPayer.tax()));
            sum += taxPayer.tax();
        }

        System.out.println();

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
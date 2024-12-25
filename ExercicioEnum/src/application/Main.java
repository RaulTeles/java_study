package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//      Formantando a entrada da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter Worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n;i++){
            System.out.print("Enter contract "+ i + "# data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            HourContract hourContract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(hourContract);

        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
//        Tratando a entrada de String e convertendo em Int
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int years = Integer.parseInt(monthAndYear.substring(3));


        System.out.println("name = " + worker.getName());
        System.out.println("Department = " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ":"+ String.format("%.2f",worker.income(years,month)));
        sc.close();
    }
}

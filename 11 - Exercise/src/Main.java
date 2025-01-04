import entities.Employee;
import entities.OutsorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nuymber of employess: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();
        //        Employee[] employees = new Employee[n];

        for (int i=1;i<=n;i++){
            System.out.println("Employee #"+i+" data:");
            System.out.print("Outsourced (y/n)? ");
            char op = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String employeesName = sc.nextLine();
            System.out.print("Hours: ");
            int employeesHours = sc.nextInt();
            System.out.print("Value per hour: ");
            double employeesVPH = sc.nextDouble();


            if (op == 'y') {
                System.out.print("Additional charge: ");
                Double employeesAdChange = sc.nextDouble();
                Employee emp = new OutsorcedEmployee(employeesName,employeesHours,employeesVPH, employeesAdChange);
//                Adicionando na lista
                list.add(emp);
            }
            else {
                Employee emp = new Employee(employeesName,employeesHours,employeesVPH);
                list.add(emp);
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : list){
            System.out.println(emp.getName()+ " - $" + String.format("%.2f",emp.payment()));
        }
        sc.close();
    }
}
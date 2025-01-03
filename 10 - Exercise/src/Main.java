import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(01,"Raul",2.700);
        BusinessAccount bcc = new BusinessAccount(102,"Ladjane",1.500,200.0);

//      UPCASTING

        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(103,"Teles",2.000,300.0);
        Account acc3 = new SavingsAccount(104,"Silva",1.300,0.15);

//       DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
//        BusinessAccount acc5 = (BusinessAcount)acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE!");
        }

        sc.close();
    }
}
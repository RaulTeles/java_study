import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Raul",500.0,0.01));
        list.add(new SavingsAccount(1004,"silva",300.0,0.01));
        list.add(new BusinessAccount(1002,"Teles",1000.0,500.0));
        list.add(new BusinessAccount(1003,"Conceição",500.0,200.0));

        double sum = 0;

        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total Balance: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }
        for (Account acc: list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(),  acc.getBalance());
        }


        sc.close();
    }
}
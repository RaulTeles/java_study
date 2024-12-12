package application;
import entities.Client;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Client client;    
        
        System.out.print("Bem vido ao banco X, para se cadastrar me informe um numero para sua conta: ");
        int numberAccount = sc.nextInt();
        System.out.print("Agora me informe o seu nome: ");
        sc.nextLine();
        String nameClient = sc.nextLine();
        System.out.println("Maravilha! Cadastro criado! Você deseja depoistar algum valor agora?\n");
        System.out.println("1 - Para depositar depois\n" +
                "2 - Para depositar agora");
        int option = sc.nextInt();

        switch (option){
            case 1:
                client = new Client(numberAccount,nameClient);
                System.out.printf(client.toString());
                System.out.println("-------------------------------------");
                System.out.println("Digite um valor que deseja depositar:");
                double deposit = sc.nextDouble();
                client.deposit(deposit);
                System.out.println("Update data: ");
                System.out.printf(client.toString());
                System.out.println("-------------------------------------");

                System.out.println("Digite um valor que deseja Sacar: ");
                double withDraw = sc.nextDouble();
                client.withdran(withDraw);
                System.out.println("Update data: ");
                System.out.printf(client.toString());
                System.out.println("-------------------------------------");
                break;
            case 2:
                System.out.println("Agora digite o valor que você quer depositar na sua conta: ");
                double depositAmount = sc.nextDouble();
                client = new Client(numberAccount,nameClient,depositAmount);
                System.out.printf(client.toString());
                System.out.println("-------------------------------------");
                deposit = sc.nextDouble();
                client.deposit(deposit);
                System.out.println("Update data: ");
                System.out.printf(client.toString());
                System.out.println("-------------------------------------");

                System.out.println("Digite um valor que deseja Sacar: ");
                withDraw = sc.nextDouble();
                client.withdran(withDraw);
                System.out.println("Update data: ");
                System.out.printf(client.toString());
                System.out.println("-------------------------------------");
                break;
        }

        sc.close();


    }
}
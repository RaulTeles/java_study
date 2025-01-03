package application;

import java.util.Locale;
import java.util.Scanner;

import products.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double prince = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name,prince,quantity);

        System.out.println("Product data: " + product.toString());


        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: " + product.toString());

        System.out.println("Enter the number of products to be remove in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: " + product.toString());

    }
}
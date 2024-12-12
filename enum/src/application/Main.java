package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order(01, LocalDate.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());

//        Convertendo enum para String, TIPO 1
        OrderStatus ors = OrderStatus.DELIVERED;
        System.out.println(ors);
//        Convertendo enum para String, TIpo 2
        OrderStatus ors2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(ors2);

    }
}

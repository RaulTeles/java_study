import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter with data of rental ");
        System.out.print("Car Model: ");
        String model = sc.nextLine();
        System.out.print("Removal car (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),dtf);
        System.out.print("Back car (dd/MM/yyyy HH:mm):");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),dtf);

        CarRental cr = new CarRental(start,finish,new Vehicle(model));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("TAX: " + cr.getInvoice().getTax());
        System.out.println("Total Payment: " + cr.getInvoice().getTotalPayment());


        sc.close();
    }
}
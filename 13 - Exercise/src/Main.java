import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int posicion = sc.nextInt();
            System.out.println(vect[posicion]);
        }catch (InputMismatchException e){
            System.out.println("Input Error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inválid option");
        }


        sc.close();
    }
}
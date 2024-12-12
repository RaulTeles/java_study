package products;

import javax.swing.plaf.ProgressBarUI;

public class Product {
    public String name;
    public double prince;
    public int quantity;

    //Criando construtor
    public Product(String name, double prince, int quantity){
        this.name = name;
        this.prince = prince;
        this.quantity = quantity;
    }
    //Criando uma sobrecarga (Repetindo o nome do metodo com outra quantidade de parametros)
    public Product(String name, double prince){
        this.name = name;
        this.prince = prince;
    }

    public double totalValueInStock(){
        return prince * quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return (name + ", $ " + String.format("%.2f",prince) + ", " + quantity + " units, total: $ " + String.format("%.2f",totalValueInStock()));
    }
}

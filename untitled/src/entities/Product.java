package entities;

import java.util.Dictionary;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}



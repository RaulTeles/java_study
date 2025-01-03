package Funcionario;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double NetSalary(){
        return  grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += this.grossSalary * percentage / 100.0;

    }

    public String toString(){
        return ("Employee: "+ name +", $ "+ String.format("%.2f",NetSalary()));
    }
}

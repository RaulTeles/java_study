package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(){
        super();
    }
    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double totalAnual;
        if (numberOfEmployees >= 10){
            totalAnual = anualIncome * 0.14;
        }else {
            totalAnual = anualIncome * 0.16;
        }
        return totalAnual;
    }
}

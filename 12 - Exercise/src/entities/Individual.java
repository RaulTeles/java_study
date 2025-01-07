package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double totalAnual;
        if (anualIncome <= 20000.00){
             totalAnual = anualIncome * 0.15;
        }else {
             totalAnual = anualIncome * 0.25;
        }
        double totalHealt = healthExpenditures * 0.50;
        return totalAnual - totalHealt;
    }
}

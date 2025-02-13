package entities;

public class OutsorcedEmployee extends Employee{
    private Double additionalCharge;

    public OutsorcedEmployee(){
        super();
    }

    public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payment(){
        return ((110 * additionalCharge) /100 ) + (hours * valuePerHour);
//        return super.payment() + additionalCharge * 1.1
    }

}

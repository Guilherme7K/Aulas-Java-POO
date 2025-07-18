package ex139.entities;

public class Individual extends TaxPayer {

    private Double healthcareExpenses;

    public Individual(String name, Double anualIncome, Double healthcareExpenses) {
        super(name, anualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double tax() {
        double basicTax;
        if(getAnualIncome() < 20000){
            basicTax = getAnualIncome() * 0.15;

        }
        else{
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealthcareExpenses() * 0.5;
        if (basicTax < 0.0){
            basicTax = 0.0;
        }
        return basicTax;
    }
}

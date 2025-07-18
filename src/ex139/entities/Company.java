package ex139.entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployer;

    public Company(String name, Double anualIncome, Integer numberOfEmployer) {
        super(name, anualIncome);
        this.numberOfEmployer = numberOfEmployer;
    }

    public Integer getNumberOfEmployer() {
        return numberOfEmployer;
    }

    public void setNumberOfEmployer(Integer numberOfEmployer) {
        this.numberOfEmployer = numberOfEmployer;
    }

    @Override
    public double tax() {
        double basicTax = numberOfEmployer <= 10 ? getAnualIncome() * 0.16 : getAnualIncome() * 0.14;
        return basicTax;
    }
}

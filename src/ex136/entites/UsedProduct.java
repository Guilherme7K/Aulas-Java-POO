package ex136.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufacutureDate;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufacutureDate) {
        super(name, price);
        this.manufacutureDate = manufacutureDate;
    }


    public Date getManufacutureDate() {
        return manufacutureDate;
    }

    public void setManufacutureDate(Date manufacutureDate) {
        this.manufacutureDate = manufacutureDate;
    }

    @Override
    public String priceTag(){
        return getName() + " (used) $ " + String.format("%.2f",getPrice()) + " (Manufacture date: " + sdf.format(manufacutureDate) + ")";
    }
}

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {

    private double discountedPrice;
    private double weightKg;
    private String dimentions;

    public PhysicalProduct(){
    }
    
    public PhysicalProduct(long id,String name,double price,double weightKg, String dimentions){
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimentions = dimentions;
        this.discountedPrice = price;
    }
    public double getWeightKg(){
        return weightKg;
    }
    public String getDimentions(){
        return dimentions;
    }

    @Override
    public String getName(){
        return "Physical: " + getName()
                + " | Weight : " + weightKg + " kg";
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

}


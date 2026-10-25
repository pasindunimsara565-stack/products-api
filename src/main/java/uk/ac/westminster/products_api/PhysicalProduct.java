package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimentions;
    
    public PhysicalProduct(){
    }
    
    public PhysicalProduct(long id,String name,double price,double weightKg, String dimentions){
        super(id,name,price);
        this.weightKg = weightKg;
        this.dimentions = dimentions;
    }
    public double getWeightKg(){
        return weightKg;
    }
    public String getDimentions(){
        return dimentions;
    }
}


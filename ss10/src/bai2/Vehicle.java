package bai2;

public abstract class Vehicle {
    protected String brand;
    public Vehicle(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public abstract String move();
}

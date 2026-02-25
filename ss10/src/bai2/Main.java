package bai2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Giant");

        System.out.println(car.move());
        System.out.println(bicycle.move());
    }
}

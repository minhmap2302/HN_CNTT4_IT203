package bai5;

public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("An", 8000);
        Employee manager = new Manager("Bình", 10000, 3000);

        System.out.println("Lương OfficeStaff: " + staff.calculateSalary());
        System.out.println("Lương Manager: " + manager.calculateSalary());
    }
}
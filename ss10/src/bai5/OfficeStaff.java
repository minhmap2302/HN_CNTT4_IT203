package bai5;

public class OfficeStaff extends Employee {

    public OfficeStaff(String Name, double baseSalary) {
        super(Name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

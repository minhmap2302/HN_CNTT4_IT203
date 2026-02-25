package bai5;

public abstract class Employee {
    private String Name;
    protected double baseSalary;
    public Employee(String Name,double baseSalary){
        this.Name=Name;
        this.baseSalary=baseSalary;
    }
    public abstract double  calculateSalary();
}

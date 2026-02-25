package bai5;

public class Manager extends Employee implements BonusCalculator{
    private double bonus;
    public Manager(String Name, double baseSalary,double bonus) {
        super(Name, baseSalary);
        this.bonus=bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+getBonus();
    }
}

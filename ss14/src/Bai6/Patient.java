package Bai6;

public class Patient {
    protected String Name;
    protected int age;
    protected String Khoa;
    public Patient(String name,int age,String khoa){
        this.age=age;
        this.Name=name;
        this.Khoa=khoa;
    }
    @Override
    public String toString() {
        return Name + " (" + age + " tuổi)";
    }
}

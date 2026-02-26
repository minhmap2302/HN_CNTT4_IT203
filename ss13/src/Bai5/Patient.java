package Bai5;

public class Patient {
    protected String id;
    protected String fullname;
    protected int age;
    protected String diagnosis;

    public Patient(String id,int age,String fullname,String diagnosis) {
        this.age = age;
        this.id=id;
        this.fullname=fullname;
        this.diagnosis=diagnosis;

    }
    public void hienThi() {
        System.out.println(id + " | " + fullname + " | " + age + " | " + diagnosis);
    }
}

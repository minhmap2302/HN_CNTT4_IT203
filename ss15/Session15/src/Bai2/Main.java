package Bai2;

public class Main {
    public static void main(String[] args) {
        PatientQueue queue=new PatientQueue();
        queue.addPatient(new Patient(12,"I01","duong"));
        queue.addPatient(new Patient(12,"I02","duong1"));
        queue.addPatient(new Patient(12,"I013","duong2"));
        System.out.println(queue.callNextPatient().toString());
        System.out.println(queue.peekNextPatient().toString());
        queue.displayQueue();
    }
}

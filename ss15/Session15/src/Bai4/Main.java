package Bai4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("P01", "An", 2));
        eq.addPatient(new EmergencyPatient("P02", "Binh", 1));
        eq.addPatient(new EmergencyPatient("P03", "Cuong", 2));
        eq.addPatient(new EmergencyPatient("P04", "Dung", 1));

        System.out.println(eq.callNextPatient().getName());
        System.out.println(eq.callNextPatient().getName());
        System.out.println(eq.callNextPatient().getName());
    }
}

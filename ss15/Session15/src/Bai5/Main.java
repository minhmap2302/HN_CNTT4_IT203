package Bai5;

public class Main {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient(12,"ID12","An");
        EmergencyCase c1 = new EmergencyCase();

        c1.addStep(new TreatmentStep("Đo huyết áp", "08:00"));
        c1.addStep(new TreatmentStep("Tiêm thuốc", "08:05"));
        c1.addStep(new TreatmentStep("Theo dõi", "08:10"));

        queue.addCase(c1);

        EmergencyCase current = queue.getNextCase();
        current.displaySteps();

        System.out.println("Hoàn tác bước:");
        System.out.println(current.undoStep());

        current.displaySteps();
    }
}
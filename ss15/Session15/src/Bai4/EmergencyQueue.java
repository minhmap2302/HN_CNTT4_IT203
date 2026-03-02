package Bai4;
import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    private Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
        } else {
            normalQueue.add(p);
        }
    }

    public EmergencyPatient callNextPatient() {
        if (!emergencyQueue.isEmpty()) {
            return emergencyQueue.poll();
        }
        return normalQueue.poll();
    }

    public void displayQueue() {
        System.out.println("== CẤP CỨU ==");
        for (EmergencyPatient p : emergencyQueue) {
            System.out.println(p.getName());
        }

        System.out.println("== THƯỜNG ==");
        for (EmergencyPatient p : normalQueue) {
            System.out.println(p.getName());
        }
    }
}

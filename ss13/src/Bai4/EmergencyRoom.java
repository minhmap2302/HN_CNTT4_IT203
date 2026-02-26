package Bai4;

import java.util.LinkedList;

public class EmergencyRoom {
    LinkedList<String> queue=new LinkedList<>();
    public void patientCheckIn(String name) {
        queue.addLast(name);
        System.out.println(name + " đã check-in (bệnh nhân thường).");
    }
    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
        System.out.println(name + " là ca NGUY KỊCH! Được ưu tiên trước.");
    }
    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ.");
        } else {
            String patient = queue.removeFirst();
            System.out.println("Đang chữa trị cho bệnh nhân: " + patient);
        }
    }

}

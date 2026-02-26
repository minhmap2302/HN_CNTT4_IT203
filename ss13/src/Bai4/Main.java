package Bai4;

public class Main {
    public static void main(String[] args) {
        EmergencyRoom room = new EmergencyRoom();
        room.patientCheckIn("hoa");
        room.emergencyCheckIn("lan");
        room.treatPatient();
        room.treatPatient();
    }
}

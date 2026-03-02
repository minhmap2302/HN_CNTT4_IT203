package Bai1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history=new MedicalRecordHistory();
        history.addEdit(new EditAction("Sua lan thu 1","10:10"));
        history.addEdit(new EditAction("sua lan thu 2","12:10"));
        history.isEmpty();
        history.displayHistory();
        System.out.println(history.getLatestEdit());
        System.out.println(history.undoEdit());
    }
}

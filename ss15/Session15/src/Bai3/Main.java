package Bai3;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println(checker.checkProcess(process1));

        checker.reset();

        String[] process2 = {"POP", "PUSH"};
        System.out.println(checker.checkProcess(process2));

        checker.reset();

        String[] process3 = {"PUSH", "POP", "PUSH"};
        System.out.println(checker.checkProcess(process3));
    }
}

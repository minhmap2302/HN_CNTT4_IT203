package Bai5;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Patient> queue = new TreeSet<>(
        );

        queue.add(new Patient("An", 2, 10));
        queue.add(new Patient("Bình", 1, 12));
        queue.add(new Patient("Chi", 1, 8));
        queue.add(new Patient("Dũng", 3, 5));

        System.out.println("HÀNG ĐỢI CẤP CỨU:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}

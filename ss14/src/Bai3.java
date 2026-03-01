import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        Set<String> A=new HashSet<>();
        Set<String>B=new HashSet<>();
        A.add("Aspirin");
        A.add("Caffeine");
        A.add("Paracetamol");
        B.add("Caffeine");
        B.add("Aspirin");
        Set<String> waring=new HashSet<>(A);
        waring.retainAll(B);
        Set<String> Antoan=new HashSet<>(A);
        Antoan.removeAll(B);
        System.out.println("An toan:"+Antoan);
        System.out.println("Canh bao:"+waring);
    }
}

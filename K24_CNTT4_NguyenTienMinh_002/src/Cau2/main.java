package Cau2;
import java.util.*;

public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.trim().isEmpty()){
            System.out.println("Loi: CHuoi ko duoc de trong");
            return;
        }

        input = input.toLowerCase();
        input = input.replaceAll("[.,]", "");

        String[] words = input.split("\\s+");
        Map<Integer, Set<String>> map = new TreeMap<>();
        for (String word : words){
            int length = word.length();
            map.putIfAbsent(length, new HashSet<>());
            map.get(length).add(word);
        }

        System.out.println("Phan loai theo do dai: ");
        for (Map.Entry<Integer, Set<String>> entry : map.entrySet()){
            System.out.println("- " + entry.getKey() + " ky tu: " + entry.getValue());
        }
    }
}

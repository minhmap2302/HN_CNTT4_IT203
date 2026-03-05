package Cau1;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        if ( n <= 0 ){
            System.out.println("So luong ko hop le");
            return;
        }
        List<Integer> students = new ArrayList<>();
        for (int i = 0; i < n; i++){
            students.add(sc.nextInt());
        }

        Set<Integer> set = new HashSet<>(students);

        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);

        System.out.println("So hoc sinh nhan hoc bong: " + result.size());
        System.out.println("Danh sach da sap xep: ");
        for (int id : result){
            System.out.print(id + " ");
        }
    }
}

package Cau2;

import java.util.Scanner;
import java.util.*;

public class sapxepmangtheodieukien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> le = new ArrayList<>();
        List<Integer> chan = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                le.add(arr[i]);
            } else {
                chan.add(arr[i]);
            }
        }
        le.sort(Collections.reverseOrder());
        Collections.sort(chan);
        for (int x : le) {
            System.out.print(x + " ");
        }
        for (int x : chan) {
            System.out.print(x + " ");
        }
    }
}

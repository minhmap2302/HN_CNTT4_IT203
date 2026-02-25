package Cau2;

import java.util.Scanner;

public class timcapsolienkecotongsolonnha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so phan tu: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Khong hop le");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Moi ban nhap so thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0] + arr[1];
        int n1 = arr[0];
        int n2 = arr[1];
        for (int i = 1; i < n - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                n1 = arr[i];
                n2 = arr[i + 1];
            }
        }
        System.out.println("Cap so lien ke co tong lon nhat la: " + n1 + " va " + n2+ " (Tong la: " + maxSum + ")");
    }
}


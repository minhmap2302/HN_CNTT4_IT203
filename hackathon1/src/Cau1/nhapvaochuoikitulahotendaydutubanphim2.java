package Cau1;

import java.util.Scanner;

public class nhapvaochuoikitulahotendaydutubanphim2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();
        name = name.trim().replaceAll("\\s+", " ");
        name = name.toLowerCase();
        String[] words = name.split(" ");
        String ten = words[words.length - 1];
        StringBuilder email = new StringBuilder();
        email.append(ten);
        for (int i = 0; i < words.length - 1; i++) {
            email.append(words[i].charAt(0));
        }
        email.append("@rikkei.edu.com");
        System.out.println("Email: " + email);
    }
}

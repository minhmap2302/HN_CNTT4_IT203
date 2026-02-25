package Cau1;

import java.util.Scanner;

public class nhapvaochuoikitulahotendaydutubanphim2 {
    public static String generateEmail(String fullName) {
        fullName = fullName.trim().replaceAll("\\s+", " ");
        fullName = fullName.toLowerCase();
        String[] words = fullName.split(" ");
        String lastName = words[words.length - 1];
        StringBuilder initials = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            initials.append(words[i].charAt(0));
        }
        return lastName + initials.toString() + "@rikkei.edu.com";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String fullName = sc.nextLine();
        String email = generateEmail(fullName);
        System.out.println("Email: " + email);
    }
}

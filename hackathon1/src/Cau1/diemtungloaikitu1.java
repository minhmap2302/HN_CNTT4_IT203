package Cau1;

import java.util.Scanner;

public class diemtungloaikitu1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        int letter = 0;
        int number = 0;
        int specialCharacter = 0;

        for (int i = 0; i< input.length(); i++){
            char c = input.charAt(i);

            if (Character.isLetter(c)){
                letter++;
            } else if (Character.isWhitespace(c)){
                specialCharacter++;
            } else if (Character.isDigit(c)) {
                number++;
            } else {
                specialCharacter++;
            }
        }

        System.out.println("Chu cai la " +letter);
        System.out.println("Chu so la " +number);
        System.out.println("Ky tu dac biet la " +specialCharacter);

        if (letter > specialCharacter && letter > number){
            System.out.println("In ra: " +letter);
        } else if (number > specialCharacter && number > letter) {
            System.out.println("In ra: " +number);
        } else {
            System.out.println("In ra:" +specialCharacter);
        }
    }
}

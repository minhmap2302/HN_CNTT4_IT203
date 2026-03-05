package Cau3;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.*;

public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.trim().isEmpty()){
            System.out.println("Loi chuoi ko duoc de trong");
            return;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch: input.toCharArray()){
            if(ch == '(' || ch == '{' | ch == '['){
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']'){
                if (stack.isEmpty()){
                    System.out.println("Khong hop le");
                    return;
                }
                char top = stack.pop();

                if ((ch == ')') && (ch == '(') || (ch == '}') && (ch == '{') || (ch == ']') && (ch == '[')){
                    System.out.println("Khong hop le");
                    return;
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("Hop le");
        } else {
            System.out.println("Khong hop le");
        }
    }
}

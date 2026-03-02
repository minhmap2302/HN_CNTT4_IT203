package Bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    Stack<String> stack=new Stack<>();
    boolean checkProcess(String[] actions){
        for (String T:actions){
            if (T.equalsIgnoreCase("Push")){
                stack.push("Medication");
            }else if(T.equalsIgnoreCase("POP")){
               if(stack.isEmpty()){
                   return false;
               }
               stack.pop();
            }
        }
        return stack.isEmpty();
    }
    void reset(){
        stack.clear();
    }

}

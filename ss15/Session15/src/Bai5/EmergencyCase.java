package Bai5;

import java.util.Stack;

public class EmergencyCase {
    Patient patient;
    Stack<TreatmentStep> steps=new Stack<>();
    void addStep(TreatmentStep step){
        steps.push(step);
    }
    TreatmentStep undoStep(){
        if (steps.isEmpty()){
            return null;
        }
        return steps.pop();
    }
    void displaySteps(){
       for (TreatmentStep s:steps){
           System.out.println(s);
       }
    }
}

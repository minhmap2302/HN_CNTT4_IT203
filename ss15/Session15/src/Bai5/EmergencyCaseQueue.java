package Bai5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    Queue<EmergencyCase> cases=new LinkedList<>();
    void addCase(EmergencyCase c){
        cases.add(c);
    }
    EmergencyCase getNextCase(){
        if(cases.isEmpty()){
            return null;
        }
        return cases.poll();
    }
}

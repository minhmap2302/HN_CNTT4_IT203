package Bai2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    Queue<Patient> queue=new LinkedList<>();
    void addPatient(Patient p){
        queue.offer(p);
    }
    Patient callNextPatient(){
       if(queue.isEmpty()){
           return null;
       }
       return queue.poll();
    }
    Patient peekNextPatient(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.peek();
    }
    boolean isEmpty(){
        if(queue.isEmpty()){
            return true;
        }
        return false;
    }
    void displayQueue(){
        for (Patient T:queue){
            System.out.println(T.toString());
        }
    }
}

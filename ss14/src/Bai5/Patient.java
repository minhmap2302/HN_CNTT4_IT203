package Bai5;

import java.util.HashMap;
import java.util.Map;

public class Patient implements Comparable<Patient> {
    protected String name;
    protected int severity;
    protected int arrivalTime;
    public Patient(String name, int sevrtity, int arrivalTime){
        this.arrivalTime=arrivalTime;
        this.name=name;
        this.severity=sevrtity;
    }
    @Override
    public String toString() {
        return name + " | severity=" + severity + " | time=" + arrivalTime;
    }

    @Override
    public int compareTo(Patient other) {
        if(severity!=other.severity){
            return severity-other.severity;
        }
        if(arrivalTime!= other.arrivalTime){
            return arrivalTime-other.arrivalTime;
        }
        return name.compareTo(other.name);
    }
}

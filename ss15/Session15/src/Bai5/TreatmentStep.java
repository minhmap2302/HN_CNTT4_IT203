package Bai5;

public class TreatmentStep {
    String description;
    String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    @Override
    public String toString() {
        return
                "description='" + description + '\'' +
                ", time='" + time + '\'' ;
    }
}

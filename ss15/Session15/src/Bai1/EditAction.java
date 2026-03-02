package Bai1;

public class EditAction {
    String description;
    String Time;

    public EditAction(String description,String Time) {
        this.description = description;
        this.Time=Time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }
    @Override
    public String toString() {
        return "EditAction{" +
                "description='" + description + '\'' +
                ", time='" + Time + '\'' +
                '}';
    }
}

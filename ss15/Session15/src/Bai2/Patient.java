package Bai2;

public class Patient {
    String id;
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "age=" + age +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

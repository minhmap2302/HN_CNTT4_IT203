package demo;
import java.sql.Date;
import java.util.Scanner;


public class Demo {
    private String id;
    private String name;
    private String producer;
    private int year;
    private Date year2;

    public Demo(String id, String name, String producer, int year, Date year2) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.year2 = year2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public Date getYear2() {
        return year2;
    }
}

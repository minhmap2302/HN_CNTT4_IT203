package bai1;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(2);
        Rectangle r=new Rectangle(5,4);
        System.out.println("dien tich hinh tron:"+c.getArea());
        System.out.println("chu vi hinh tron:"+c.getPerimeter());
        System.out.println("dien tich hinh chu nhat:"+r.getArea());
        System.out.println("chu vi hinh chu nhat:"+r.getPerimeter());
    }

}

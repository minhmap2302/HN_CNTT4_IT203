package bai1;

public class Rectangle implements Shape{
    private double Width;
    private double height;
    public Rectangle(double w,double h){
        this.height=h;
        this.Width=w;
    }


    @Override
    public double getArea() {
        return Width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(Width+height);
    }
}

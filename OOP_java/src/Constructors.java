import java.lang.*;


class Rectangle {

    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double l){
        length =  (l>0) ? l:0;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double b) {
        breadth = (b > 0) ? b : 0;
    }


    // we don't refine any return type or return in constructors
    public Rectangle() {
        length =3;
        breadth=2;
        }

    public Rectangle(double l,double b) {
        length = l;
        breadth = b;
    }

    public Rectangle(double s) {
        length = breadth = s;
    }

    public double area() {
        return getLength() * getBreadth();
    }

}


public class Constructors {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
        System.out.println("r1 area is " + r1.area());

        Rectangle r2 = new Rectangle(5,7);
        System.out.println(r2.getLength());
        System.out.println(r2.getBreadth());
        System.out.println("r2 area is " + r2.area());

        Rectangle r3 = new Rectangle(5);
        System.out.println(r3.getLength());
        System.out.println(r3.getBreadth());
        System.out.println("r3 area is " + r3.area());

    }

}

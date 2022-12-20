
class Rectangle {

    public double length;
    private double breadth;

    public double getBreadth(){
        return breadth;
    }

    public void setBreadth(double b) {
        if (breadth >=0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return length * breadth;
    }

    public double parimeter() {
        return 2 * length * breadth;
    }

}



public class B_Public_private {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 3.4;
        r.setBreadth(3);

        System.out.println(r.length);
        System.out.println(r.getBreadth());
        System.out.println(r.area());

    }

}

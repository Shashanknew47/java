
class Rectangle {

    public float area(float length, float width) {
        return length * width;
    }
}


public class prac {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        float area_rectangle = r.area(4.2f,3.5f);
        System.out.println(area_rectangle);

    }

}

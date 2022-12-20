
// As per number of parameters and type of parameter Java class will know which method needed to called when
// methods have same names. For similar behavior of functionality we use this.
public class B_method_overloading {

    static int max (int x, int y) {

        return x>y?x:y;
    }

    static float max (float x, float y) {
        if (x > y)
            return x;
        else
            return y;
    }

    static int max(int x, int y, int z) {
        if (x > y && x > z)
                return x;
        else if (y > z)
                return y;
        else
                return z;
    }


    public static void main(String[] args) {

        float m = max(34.4f,45.4f);
        System.out.println(m);

        int i = max(4,43,323);
        System.out.println(i);

    }

}


import java.lang.*;

class Methods {

    // This method is static bez this is called by main method which is also static. A static method is called by static method.
    // Method should give it's return type also in the beginning.

    // if method returns None, than it's type must be mentioned void

    static int max (int x, int y) {

        if (x > y) {
            return x;
        }
        else {
            return y;
        }

        }

    int min (int x, int y) {
        if (x < y) {
            return x;
        }
        else {
            return y;
        }
        }

    static void changeFirst(int A[]) {

        A[0] = 100;

    }
    public static void main(String[] args) {

        int i=10,j=15;


        int maximum = max(i,j);
        System.out.println(maximum);

        // if method is not static then first you will have make a object and then call that
        // method on that object.

        Methods mp = new Methods();
        int minimum = mp.min(i,j);
        System.out.println(minimum);


        // array is a mutable and is reference by. So, method will change the origin also
        System.out.println("====Array change by void method======");
        int arr[] = {1,3,34,4};
        changeFirst(arr);
        for (int x:arr) {
            System.out.println(x);
            break;
        }
    }

}


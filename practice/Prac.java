 import java.lang.*;
import java.util.*;


class Prac {
     public static void main(String[] arg) {
        // System.out.println("Hello, world!");
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        // char x = 0x03C8;
        // System.out.println(x);

        Scanner s = new Scanner(System.in);
        float i,j;
        System.out.println("print the value of i and j");
        i = s.nextFloat();
        j = s.nextFloat();
        float area = 1/3f * i * j;
        System.out.println(area);

    }
}
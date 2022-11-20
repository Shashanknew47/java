import java.lang.*;


public class Trial {
    public static void main(String[] args) {
        byte i = 21;
        byte j = 102;
        byte m = 21;

        boolean k = (j>i) && (j>m);

        System.out.println(k);

        if (k) {
            System.out.println("done boolean operator checking");
        }

    }
}

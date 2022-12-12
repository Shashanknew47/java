import java.lang.*;
import java.util.*;


class B_Learn_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        switch (i) {
            case 6:
                double j = Math.sqrt(i);
                System.out.println(j);
                break;

            case 36:
                int k = i * 2;
                System.out.println(k);
                break;

            default:
               System.out.println("nothing matched");
               break;
        }
    }
}
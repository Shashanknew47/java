import java.util.*;;

public class Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double r1,r2;
        System.out.println("Value of a, b, & c");
        r1 =(-b + Math.sqrt(b * b - 4 * a * c))/ (2 * a);
        System.out.println("Value of r1 is " + r1);


    }
}

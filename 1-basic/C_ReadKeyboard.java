import java.lang.*;
import java.util.*;


// If you want to see details of Scanner class the use in command line : javap java.util.Scanner
// there will only one type of scanner will work like either nextint or nextline


class Area {

    public int area(int a,int b){
        return a * b;
    }
}

public class C_ReadKeyboard {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int x,y,z;
        String s;

        x = sc.nextInt();
        y = sc.nextInt();

        // s = sc.nextLine();
        // System.out.println(s);

        Area plot_area = new Area();
        z = plot_area.area(x,y);

        System.out.println("Area is : " + z);


    }
}

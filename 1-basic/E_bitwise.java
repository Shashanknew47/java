

public class E_bitwise {

    public static void main (String []args) {
        int x,y,z;
        x = 10;
        y = 6;

        z = x ^ y;

        int q = x >>1;
        System.out.println(q);
        System.out.println(z);
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        System.out.println(String.format("%s",Integer.toBinaryString(~z)));
        System.out.println(String.format("%s",Integer.toBinaryString(-z)));
        int i,j;
        i = 9;
        j = 12;
        i = i ^ j;

        System.out.println(i);
        i = i ^ j;
        System.out.println(i);
        i = j ^ i;
        System.out.println(i);


    }

}

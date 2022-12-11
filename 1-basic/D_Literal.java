//  Literals are values  by default literals will be
//    => For any numbers it will be int.
//    => For any decimal values it will be double.
//

//      => byte :  int
//      => short : int
//      => int : int       (By default)
//      => long : l or L
//      => float : f or F
//      => double : d or D (By default)
//      => char : ''
//      => bool : true/false
//

public class D_Literal {
    public static void main(String args[]) {

        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0xA;

        long l = 1024_233_4344L;
        float f = 2.33F;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(l);
        System.out.println(Float.toString(l + f));


    }
}

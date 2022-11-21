import java.io.StringReader;

/*  In java every primitive type data is associated with class. ex. int with Integer; byte with Byte,
char with Character; bool with Boolean   */

/*  Imp. point if you use single character and text is wrap in single quotes  ex. 'A' it will be char.
   if it is in double quotes like this String s = "Apple". this means it is a string literal.  */

public class B_Types {

    public static void main(String args[]) {
        System.out.println("Byte min" + Byte.MIN_VALUE );
        System.out.println("Byte max" + Byte.MAX_VALUE);
        System.out.println("int min" + Integer.MIN_VALUE);
        System.out.println("int max" + Integer.MAX_VALUE);
        int i = 5;
        System.out.println(Integer.toBinaryString(i));

        // Negative integer gets converted into binary in 2's complement. where first every bit will be reversed and then 1 will be added.
        int j = -5;
        System.out.println(Integer.toBinaryString(j));

        int k = 10;
        System.out.println(Integer.toOctalString(k));


        int l = 10;
        System.out.println(Integer.toHexString(l));

    }

}

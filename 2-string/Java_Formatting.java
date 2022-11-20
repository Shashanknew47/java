import java.lang.*;

// char c
// int d,o (octal), x(hexadecimal)
// float f, e, g
// String s

class Java_Formatting {

    public static void main(String[] args) {
        int a = -11;
        float f = 3f;
        String s = new String("text");
        int c = 15;
        double decimal_number = 111.3344453;
        System.out.printf("This is with the formatting of %d, %f,   %s \n ",a,f,s);
        System.out.printf("This is with the formatting of second arg -- %2$e -- first arg -- %1$x --  third arg -- %3$s -- \n ",a,f,s);
        System.out.printf("%05d\n",a);  // Here 5 means it will take 5 places and 0 means on empty places 0 will be placed.
        System.out.printf("%(d \n",a);  // if number is negative then it will be revealed in bracket that is the effect of parentheses.
        System.out.printf("%+d \n",c);   // + sing will show the sign of the number too.
        System.out.printf("%10.2f is a decimal_number \n",decimal_number); //  "10" here means total places it will  take is 10 and "2" meands decimal point will be 2.
        System.out.printf("%-10.2f is a decimal_number \n",decimal_number);// "-" sign means that rest empty places will places to the right side.
    }
}

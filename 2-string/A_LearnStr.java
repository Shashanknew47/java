import java.lang.*;


public class A_LearnStr {

    public static void main(String[] args) {

    String str1 = "Java Program";      //  String "Java Program" will be saved in a pool
    String str2 = "Java Program";     // In this case Java "Java Program" will be reused from pool

    String str3 = new String("Java Program");  // In this case sting ""Java Program"" will be saved in heap and will not be reused

    char c[] = {'H','E','L','L','O'};
    String str4 = new String(c,1,2);


    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);


    // In java sting == operator is like "is" operator in Python. It check if they same object or not instead of equality.
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);

    System.out.println(c);
    System.out.println(str4);


    }

}

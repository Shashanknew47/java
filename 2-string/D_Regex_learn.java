import java.lang.*;

import javax.net.ssl.SSLKeyException;

class D_Regex_learn {
    public static void main(String[] args) {
        String j  = "Java 9999-333-222";

        System.out.println(j.matches("[A-Z][a-z]*\s\\d{4}-\\d{3}-\\d{3}"));


        int b = 101010;
        System.out.println(String.valueOf(b).matches("[0,1]*"));  // if b is binary of not.



        // Remove extra charaters with repalce all and regex

        String extra_string = "abc % &  334 f";
        String new_string = extra_string.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(new_string);




    }
}

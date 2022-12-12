import java.lang.*;

class A_if {
    public static void main(String[] args) {
        int a = 50;

        if (a>70) {
            System.out.println("high");

        }

        else if (a>=50) {
            System.out.println("mid");
        }


        else if (a>30) {
            System.out.println("low");
        }


        else {
            System.out.println("fail");
        }
    }
}

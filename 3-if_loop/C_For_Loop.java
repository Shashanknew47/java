import java.lang.*;

class C_For_Loop {
    public static void main(String[] args) {

        {
            // all argument in the first parentheses are optional. check below example after this loop.
            for(int i=1;i<4;i++) {
                System.out.println(i);
            }
        }

        System.out.println("=========================");


        int x = 2;
        {
            for(;;){
                System.out.println(x);
                x +=1;
                if(x>5) {
                    break;
                }
            }
        }

    }



}
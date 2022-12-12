public class D_While_Loop {
    public static void main(String[] args) {

        int x = 4;
        while (x<8) {

            x++;
            System.out.println(x);
            System.out.println("inside in the for loop");
            for(int i=1;i<4;i++){
                System.out.println(i*x);
            }

            System.out.println("out of for loop");
        }

        System.out.println("-------------Do while loop------------------");

        do {
            System.out.println(x);
            x++;
        } while (x<11);
    }
}
